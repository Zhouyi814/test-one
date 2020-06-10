package com.shen.autocoding.engine.model;

public class SysRoleModule {
    private String roleModuleId;

    private String roleId;

    private String moduleId;

    private String moduleTree;

    public String getRoleModuleId() {
        return roleModuleId;
    }

    public void setRoleModuleId(String roleModuleId) {
        this.roleModuleId = roleModuleId == null ? null : roleModuleId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
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