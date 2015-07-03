package com.manywho.sdk.services;

import com.github.fge.lambdas.Throwing;
import com.manywho.sdk.entities.ValueAware;
import com.manywho.sdk.services.annotations.Id;
import com.manywho.sdk.services.annotations.Property;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class PropertyCollectionParser extends AbstractCollectionParser {
    private Set<Field> idFields;
    private Set<Field> propertyFields;

    public PropertyCollectionParser() {
        this.idFields = CachedData.reflections.getFieldsAnnotatedWith(Id.class);
        this.propertyFields = CachedData.reflections.getFieldsAnnotatedWith(Property.class);
    }

    @Override
    public <T> T parse(ValueAware properties, Class<T> tClass) throws Exception {
        return parse(properties, null, tClass);
    }

    @Override
    public <T> T parse(ValueAware properties, String id, Class<T> tClass) throws Exception {
        T entity = tClass.newInstance();

        if (StringUtils.isNotEmpty(id)) {
            setIdentifierValue(tClass, id, entity);
        }

        if (properties != null && this.propertyFields != null) {
            setFieldValues(tClass, properties, entity);
        }

        validate(entity);

        return entity;
    }

    private <T> void setIdentifierValue(Class<T> tClass, String id, T entity) {
        this.idFields.stream()
                .filter(field -> field.getDeclaringClass().equals(tClass))
                .forEach(Throwing.consumer(field -> {
                    field.setAccessible(true);
                    field.set(entity, id);
                }));
    }

    private <T> void setFieldValues(Class<T> tClass, ValueAware properties, T entity) {
        this.propertyFields.stream()
                .filter(field -> field.getDeclaringClass().equals(tClass))
                .forEach(Throwing.consumer(field -> {
                    Property annotation = field.getAnnotation(Property.class);

                    field.setAccessible(true);

                    if (annotation.isObject()) {
                        setObjectField(field, annotation.value(), properties, entity);
                    } else if (annotation.isList()) {
                        setListField(field, annotation.value(), properties, entity);
                    } else {
                        setScalarField(field, annotation.value(), properties, entity);
                    }
                }));
    }
}
