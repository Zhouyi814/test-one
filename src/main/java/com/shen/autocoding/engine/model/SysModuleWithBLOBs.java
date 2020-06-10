package com.shen.autocoding.engine.model;

public class SysModuleWithBLOBs extends SysModule {
    private String showFields;

    private String hiddenFields;

    private String addFields;

    private String modifiyFields;

    public String getShowFields() {
        return showFields;
    }

    public void setShowFields(String showFields) {
        this.showFields = showFields == null ? null : showFields.trim();
    }

    public String getHiddenFields() {
        return hiddenFields;
    }

    public void setHiddenFields(String hiddenFields) {
        this.hiddenFields = hiddenFields == null ? null : hiddenFields.trim();
    }

    public String getAddFields() {
        return addFields;
    }

    public void setAddFields(String addFields) {
        this.addFields = addFields == null ? null : addFields.trim();
    }

    public String getModifiyFields() {
        return modifiyFields;
    }

    public void setModifiyFields(String modifiyFields) {
        this.modifiyFields = modifiyFields == null ? null : modifiyFields.trim();
    }
}