package com.shen.autocoding.engine.model;

public class SysPermissionModule {
    private String permissionModuleId;

    private String permissionId;

    private String moduleId;

    private String moduleTree;

    public String getPermissionModuleId() {
        return permissionModuleId;
    }

    public void setPermissionModuleId(String permissionModuleId) {
        this.permissionModuleId = permissionModuleId == null ? null : permissionModuleId.trim();
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getModuleTree() {
        return moduleTree;
    }

    public void setModuleTree(String moduleTree) {
        this.moduleTree = moduleTree == null ? null : moduleTree.trim();
    }
}