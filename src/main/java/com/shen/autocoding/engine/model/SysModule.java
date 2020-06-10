package com.shen.autocoding.engine.model;

import java.util.Date;

public class SysModule {
    private String moduleId;

    private String parentId;

    private String fullIndex;

    private String includedModules;

    private String moduleName;

    private String moduleType;

    private String moduleLevel;

    private String isLeaf;

    private String moduleIcon;

    private Integer moduleOrder;

    private String moduleRemark;

    private String moduleUrl;

    private String queryFields;

    private String operationOptions;

    private String joinTables;

    private String joinOptions;

    private String delFlg;

    private Date createDate;

    private String createBy;

    private Date updateDate;

    private String updateBy;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getFullIndex() {
        return fullIndex;
    }

    public void setFullIndex(String fullIndex) {
        this.fullIndex = fullIndex == null ? null : fullIndex.trim();
    }

    public String getIncludedModules() {
        return includedModules;
    }

    public void setIncludedModules(String includedModules) {
        this.includedModules = includedModules == null ? null : includedModules.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public String getModuleLevel() {
        return moduleLevel;
    }

    public void setModuleLevel(String moduleLevel) {
        this.moduleLevel = moduleLevel == null ? null : moduleLevel.trim();
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon == null ? null : moduleIcon.trim();
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public String getModuleRemark() {
        return moduleRemark;
    }

    public void setModuleRemark(String moduleRemark) {
        this.moduleRemark = moduleRemark == null ? null : moduleRemark.trim();
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    public String getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(String queryFields) {
        this.queryFields = queryFields == null ? null : queryFields.trim();
    }

    public String getOperationOptions() {
        return operationOptions;
    }

    public void setOperationOptions(String operationOptions) {
        this.operationOptions = operationOptions == null ? null : operationOptions.trim();
    }

    public String getJoinTables() {
        return joinTables;
    }

    public void setJoinTables(String joinTables) {
        this.joinTables = joinTables == null ? null : joinTables.trim();
    }

    public String getJoinOptions() {
        return joinOptions;
    }

    public void setJoinOptions(String joinOptions) {
        this.joinOptions = joinOptions == null ? null : joinOptions.trim();
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}