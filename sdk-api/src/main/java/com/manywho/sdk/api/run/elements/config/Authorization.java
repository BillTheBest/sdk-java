package com.manywho.sdk.api.run.elements.config;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.List;

public class Authorization {
    private List<User> users;
    private List<Group> groups;
    private String runningAuthenticationId;
    private AuthenticationType globalAuthenticationType;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getRunningAuthenticationId() {
        return runningAuthenticationId;
    }

    public void setRunningAuthenticationId(String runningAuthenticationId) {
        this.runningAuthenticationId = runningAuthenticationId;
    }

    public AuthenticationType getGlobalAuthenticationType() {
        return globalAuthenticationType;
    }

    public void setGlobalAuthenticationType(AuthenticationType globalAuthenticationType) {
        this.globalAuthenticationType = globalAuthenticationType;
    }

    public static enum AuthenticationType {
        Public("PUBLIC"),
        AllUsers("ALL_USERS"),
        Specified("SPECIFIED");

        private final String text;

        AuthenticationType(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }

        @JsonCreator
        public static AuthenticationType forValue(String value) {
            for (AuthenticationType authenticationType : AuthenticationType.values()) {
                if (value.equalsIgnoreCase(authenticationType.text)) {
                    return authenticationType;
                }
            }

            throw new IllegalArgumentException("No constant with text " + value + " found");
        }
    }
}