package com.manywho.sdk.services.types.system;

import com.manywho.sdk.api.AuthorizationType;
import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;

import java.time.OffsetDateTime;

@Type.Element(name = "$User")
public class $User implements Type {
    @Type.Property(name = "Altitude Accuracy", contentType = ContentType.Number)
    private Integer altitudeAccuracy;

    @Type.Property(name = "AuthenticationType", contentType = ContentType.String)
    private AuthorizationType authenticationType;

    @Type.Property(name = "Brand", contentType = ContentType.String)
    private String brand;

    @Type.Property(name = "Country", contentType = ContentType.String)
    private String country;

    @Type.Property(name = "Current Altitude", contentType = ContentType.Number)
    private Float currentAltitude;

    @Type.Property(name = "Current Heading", contentType = ContentType.Number)
    private Float currentHeading;

    @Type.Property(name = "Current Latitude", contentType = ContentType.Number)
    private Float currentLatitude;

    @Type.Property(name = "Current Longitude", contentType = ContentType.Number)
    private Float currentLongitude;

    @Type.Property(name = "Current Speed", contentType = ContentType.Number)
    private Float currentSpeed;

    @Type.Property(name = "Directory Id", contentType = ContentType.String)
    private String directoryId;

    @Type.Property(name = "Directory Name", contentType = ContentType.String)
    private String directoryName;

    @Type.Property(name = "Email", contentType = ContentType.String)
    private String email;

    @Type.Property(name = "First Name", contentType = ContentType.String)
    private String firstName;

    @Type.Property(name = "Language", contentType = ContentType.String)
    private String language;

    @Type.Property(name = "Last Name", contentType = ContentType.String)
    private String lastName;

    @Type.Property(name = "Location", contentType = ContentType.Object)
    private $Location location;

    @Type.Property(name = "Location Accuracy", contentType = ContentType.Number)
    private Float locationAccuracy;

    @Type.Property(name = "Location Timestamp", contentType = ContentType.DateTime)
    private OffsetDateTime locationTimestamp;

    @Type.Property(name = "LoginUrl", contentType = ContentType.String)
    private String loginUrl;

    @Type.Property(name = "Status", contentType = ContentType.String)
    private String status;

    @Type.Identifier
    @Type.Property(name = "User ID", contentType = ContentType.String)
    private String userId;

    @Type.Property(name = "Username", contentType = ContentType.String)
    private String username;

    @Type.Property(name = "Variant", contentType = ContentType.String)
    private String variant;

    public Integer getAltitudeAccuracy() {
        return altitudeAccuracy;
    }

    public void setAltitudeAccuracy(int altitudeAccuracy) {
        this.altitudeAccuracy = altitudeAccuracy;
    }

    public AuthorizationType getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthorizationType authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getCurrentAltitude() {
        return currentAltitude;
    }

    public void setCurrentAltitude(float currentAltitude) {
        this.currentAltitude = currentAltitude;
    }

    public Float getCurrentHeading() {
        return currentHeading;
    }

    public void setCurrentHeading(float currentHeading) {
        this.currentHeading = currentHeading;
    }

    public Float getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(float currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public Float getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(float currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public Float getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public $Location getLocation() {
        return location;
    }

    public void setLocation($Location location) {
        this.location = location;
    }

    public Float getLocationAccuracy() {
        return locationAccuracy;
    }

    public void setLocationAccuracy(float locationAccuracy) {
        this.locationAccuracy = locationAccuracy;
    }

    public OffsetDateTime getLocationTimestamp() {
        return locationTimestamp;
    }

    public void setLocationTimestamp(OffsetDateTime locationTimestamp) {
        this.locationTimestamp = locationTimestamp;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }
}
