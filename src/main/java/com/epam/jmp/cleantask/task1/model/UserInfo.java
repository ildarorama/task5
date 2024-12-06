package com.epam.jmp.cleantask.task1.model;

import java.util.Objects;

public class UserInfo {
    private final String id;
    private String userName;

    public UserInfo(String id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof UserInfo && Objects.equals(id, ((UserInfo) obj).id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}
