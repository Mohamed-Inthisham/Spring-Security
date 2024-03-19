package com.inthi.security.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {
    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_DELETE("admin:delete"),
    ADMIN_CREATE("admin:create"),
    MANAGER_READ("Manager:read"),
    MANAGER_UPDATE("Manager:update"),
    MANAGER_DELETE("Manager:delete"),
    MANAGER_CREATE("Manager:create")
    ;
    @Getter
    private final String permission;
}
