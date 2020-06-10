package com.shen.autocoding.engine.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysModuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("module_id like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("module_id not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFullIndexIsNull() {
            addCriterion("full_index is null");
            return (Criteria) this;
        }

        public Criteria andFullIndexIsNotNull() {
            addCriterion("full_index is not null");
            return (Criteria) this;
        }

        public Criteria andFullIndexEqualTo(String value) {
            addCriterion("full_index =", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexNotEqualTo(String value) {
            addCriterion("full_index <>", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexGreaterThan(String value) {
            addCriterion("full_index >", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexGreaterThanOrEqualTo(String value) {
            addCriterion("full_index >=", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexLessThan(String value) {
            addCriterion("full_index <", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexLessThanOrEqualTo(String value) {
            addCriterion("full_index <=", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexLike(String value) {
            addCriterion("full_index like", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexNotLike(String value) {
            addCriterion("full_index not like", value, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexIn(List<String> values) {
            addCriterion("full_index in", values, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexNotIn(List<String> values) {
            addCriterion("full_index not in", values, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexBetween(String value1, String value2) {
            addCriterion("full_index between", value1, value2, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andFullIndexNotBetween(String value1, String value2) {
            addCriterion("full_index not between", value1, value2, "fullIndex");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesIsNull() {
            addCriterion("included_modules is null");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesIsNotNull() {
            addCriterion("included_modules is not null");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesEqualTo(String value) {
            addCriterion("included_modules =", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesNotEqualTo(String value) {
            addCriterion("included_modules <>", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesGreaterThan(String value) {
            addCriterion("included_modules >", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesGreaterThanOrEqualTo(String value) {
            addCriterion("included_modules >=", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesLessThan(String value) {
            addCriterion("included_modules <", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesLessThanOrEqualTo(String value) {
            addCriterion("included_modules <=", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesLike(String value) {
            addCriterion("included_modules like", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesNotLike(String value) {
            addCriterion("included_modules not like", value, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesIn(List<String> values) {
            addCriterion("included_modules in", values, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesNotIn(List<String> values) {
            addCriterion("included_modules not in", values, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesBetween(String value1, String value2) {
            addCriterion("included_modules between", value1, value2, "includedModules");
            return (Criteria) this;
        }

        public Criteria andIncludedModulesNotBetween(String value1, String value2) {
            addCriterion("included_modules not between", value1, value2, "includedModules");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNull() {
            addCriterion("module_type is null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNotNull() {
            addCriterion("module_type is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeEqualTo(String value) {
            addCriterion("module_type =", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotEqualTo(String value) {
            addCriterion("module_type <>", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThan(String value) {
            addCriterion("module_type >", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("module_type >=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThan(String value) {
            addCriterion("module_type <", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThanOrEqualTo(String value) {
            addCriterion("module_type <=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLike(String value) {
            addCriterion("module_type like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotLike(String value) {
            addCriterion("module_type not like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIn(List<String> values) {
            addCriterion("module_type in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotIn(List<String> values) {
            addCriterion("module_type not in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeBetween(String value1, String value2) {
            addCriterion("module_type between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotBetween(String value1, String value2) {
            addCriterion("module_type not between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleLevelIsNull() {
            addCriterion("module_level is null");
            return (Criteria) this;
        }

        public Criteria andModuleLevelIsNotNull() {
            addCriterion("module_level is not null");
            return (Criteria) this;
        }

        public Criteria andModuleLevelEqualTo(String value) {
            addCriterion("module_level =", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotEqualTo(String value) {
            addCriterion("module_level <>", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelGreaterThan(String value) {
            addCriterion("module_level >", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelGreaterThanOrEqualTo(String value) {
            addCriterion("module_level >=", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelLessThan(String value) {
            addCriterion("module_level <", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelLessThanOrEqualTo(String value) {
            addCriterion("module_level <=", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelLike(String value) {
            addCriterion("module_level like", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotLike(String value) {
            addCriterion("module_level not like", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelIn(List<String> values) {
            addCriterion("module_level in", values, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotIn(List<String> values) {
            addCriterion("module_level not in", values, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelBetween(String value1, String value2) {
            addCriterion("module_level between", value1, value2, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotBetween(String value1, String value2) {
            addCriterion("module_level not between", value1, value2, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNull() {
            addCriterion("is_leaf is null");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNotNull() {
            addCriterion("is_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeafEqualTo(String value) {
            addCriterion("is_leaf =", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotEqualTo(String value) {
            addCriterion("is_leaf <>", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThan(String value) {
            addCriterion("is_leaf >", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThanOrEqualTo(String value) {
            addCriterion("is_leaf >=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThan(String value) {
            addCriterion("is_leaf <", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThanOrEqualTo(String value) {
            addCriterion("is_leaf <=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLike(String value) {
            addCriterion("is_leaf like", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotLike(String value) {
            addCriterion("is_leaf not like", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafIn(List<String> values) {
            addCriterion("is_leaf in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotIn(List<String> values) {
            addCriterion("is_leaf not in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafBetween(String value1, String value2) {
            addCriterion("is_leaf between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotBetween(String value1, String value2) {
            addCriterion("is_leaf not between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andModuleIconIsNull() {
            addCriterion("module_icon is null");
            return (Criteria) this;
        }

        public Criteria andModuleIconIsNotNull() {
            addCriterion("module_icon is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIconEqualTo(String value) {
            addCriterion("module_icon =", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotEqualTo(String value) {
            addCriterion("module_icon <>", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconGreaterThan(String value) {
            addCriterion("module_icon >", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconGreaterThanOrEqualTo(String value) {
            addCriterion("module_icon >=", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconLessThan(String value) {
            addCriterion("module_icon <", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconLessThanOrEqualTo(String value) {
            addCriterion("module_icon <=", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconLike(String value) {
            addCriterion("module_icon like", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotLike(String value) {
            addCriterion("module_icon not like", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconIn(List<String> values) {
            addCriterion("module_icon in", values, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotIn(List<String> values) {
            addCriterion("module_icon not in", values, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconBetween(String value1, String value2) {
            addCriterion("module_icon between", value1, value2, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotBetween(String value1, String value2) {
            addCriterion("module_icon not between", value1, value2, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIsNull() {
            addCriterion("module_order is null");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIsNotNull() {
            addCriterion("module_order is not null");
            return (Criteria) this;
        }

        public Criteria andModuleOrderEqualTo(Integer value) {
            addCriterion("module_order =", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotEqualTo(Integer value) {
            addCriterion("module_order <>", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderGreaterThan(Integer value) {
            addCriterion("module_order >", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_order >=", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLessThan(Integer value) {
            addCriterion("module_order <", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLessThanOrEqualTo(Integer value) {
            addCriterion("module_order <=", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIn(List<Integer> values) {
            addCriterion("module_order in", values, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotIn(List<Integer> values) {
            addCriterion("module_order not in", values, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderBetween(Integer value1, Integer value2) {
            addCriterion("module_order between", value1, value2, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("module_order not between", value1, value2, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkIsNull() {
            addCriterion("module_remark is null");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkIsNotNull() {
            addCriterion("module_remark is not null");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkEqualTo(String value) {
            addCriterion("module_remark =", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkNotEqualTo(String value) {
            addCriterion("module_remark <>", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkGreaterThan(String value) {
            addCriterion("module_remark >", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("module_remark >=", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkLessThan(String value) {
            addCriterion("module_remark <", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkLessThanOrEqualTo(String value) {
            addCriterion("module_remark <=", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkLike(String value) {
            addCriterion("module_remark like", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkNotLike(String value) {
            addCriterion("module_remark not like", value, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkIn(List<String> values) {
            addCriterion("module_remark in", values, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkNotIn(List<String> values) {
            addCriterion("module_remark not in", values, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkBetween(String value1, String value2) {
            addCriterion("module_remark between", value1, value2, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleRemarkNotBetween(String value1, String value2) {
            addCriterion("module_remark not between", value1, value2, "moduleRemark");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNull() {
            addCriterion("module_url is null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNotNull() {
            addCriterion("module_url is not null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlEqualTo(String value) {
            addCriterion("module_url =", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotEqualTo(String value) {
            addCriterion("module_url <>", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThan(String value) {
            addCriterion("module_url >", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("module_url >=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThan(String value) {
            addCriterion("module_url <", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThanOrEqualTo(String value) {
            addCriterion("module_url <=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLike(String value) {
            addCriterion("module_url like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotLike(String value) {
            addCriterion("module_url not like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIn(List<String> values) {
            addCriterion("module_url in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotIn(List<String> values) {
            addCriterion("module_url not in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlBetween(String value1, String value2) {
            addCriterion("module_url between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotBetween(String value1, String value2) {
            addCriterion("module_url not between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsIsNull() {
            addCriterion("query_fields is null");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsIsNotNull() {
            addCriterion("query_fields is not null");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsEqualTo(String value) {
            addCriterion("query_fields =", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotEqualTo(String value) {
            addCriterion("query_fields <>", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsGreaterThan(String value) {
            addCriterion("query_fields >", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("query_fields >=", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsLessThan(String value) {
            addCriterion("query_fields <", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsLessThanOrEqualTo(String value) {
            addCriterion("query_fields <=", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsLike(String value) {
            addCriterion("query_fields like", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotLike(String value) {
            addCriterion("query_fields not like", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsIn(List<String> values) {
            addCriterion("query_fields in", values, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotIn(List<String> values) {
            addCriterion("query_fields not in", values, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsBetween(String value1, String value2) {
            addCriterion("query_fields between", value1, value2, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotBetween(String value1, String value2) {
            addCriterion("query_fields not between", value1, value2, "queryFields");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsIsNull() {
            addCriterion("operation_options is null");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsIsNotNull() {
            addCriterion("operation_options is not null");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsEqualTo(String value) {
            addCriterion("operation_options =", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsNotEqualTo(String value) {
            addCriterion("operation_options <>", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsGreaterThan(String value) {
            addCriterion("operation_options >", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("operation_options >=", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsLessThan(String value) {
            addCriterion("operation_options <", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsLessThanOrEqualTo(String value) {
            addCriterion("operation_options <=", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsLike(String value) {
            addCriterion("operation_options like", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsNotLike(String value) {
            addCriterion("operation_options not like", value, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsIn(List<String> values) {
            addCriterion("operation_options in", values, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsNotIn(List<String> values) {
            addCriterion("operation_options not in", values, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsBetween(String value1, String value2) {
            addCriterion("operation_options between", value1, value2, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andOperationOptionsNotBetween(String value1, String value2) {
            addCriterion("operation_options not between", value1, value2, "operationOptions");
            return (Criteria) this;
        }

        public Criteria andJoinTablesIsNull() {
            addCriterion("join_tables is null");
            return (Criteria) this;
        }

        public Criteria andJoinTablesIsNotNull() {
            addCriterion("join_tables is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTablesEqualTo(String value) {
            addCriterion("join_tables =", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesNotEqualTo(String value) {
            addCriterion("join_tables <>", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesGreaterThan(String value) {
            addCriterion("join_tables >", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesGreaterThanOrEqualTo(String value) {
            addCriterion("join_tables >=", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesLessThan(String value) {
            addCriterion("join_tables <", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesLessThanOrEqualTo(String value) {
            addCriterion("join_tables <=", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesLike(String value) {
            addCriterion("join_tables like", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesNotLike(String value) {
            addCriterion("join_tables not like", value, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesIn(List<String> values) {
            addCriterion("join_tables in", values, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesNotIn(List<String> values) {
            addCriterion("join_tables not in", values, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesBetween(String value1, String value2) {
            addCriterion("join_tables between", value1, value2, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinTablesNotBetween(String value1, String value2) {
            addCriterion("join_tables not between", value1, value2, "joinTables");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsIsNull() {
            addCriterion("join_options is null");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsIsNotNull() {
            addCriterion("join_options is not null");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsEqualTo(String value) {
            addCriterion("join_options =", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsNotEqualTo(String value) {
            addCriterion("join_options <>", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsGreaterThan(String value) {
            addCriterion("join_options >", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("join_options >=", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsLessThan(String value) {
            addCriterion("join_options <", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsLessThanOrEqualTo(String value) {
            addCriterion("join_options <=", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsLike(String value) {
            addCriterion("join_options like", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsNotLike(String value) {
            addCriterion("join_options not like", value, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsIn(List<String> values) {
            addCriterion("join_options in", values, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsNotIn(List<String> values) {
            addCriterion("join_options not in", values, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsBetween(String value1, String value2) {
            addCriterion("join_options between", value1, value2, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andJoinOptionsNotBetween(String value1, String value2) {
            addCriterion("join_options not between", value1, value2, "joinOptions");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNull() {
            addCriterion("del_flg is null");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNotNull() {
            addCriterion("del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlgEqualTo(String value) {
            addCriterion("del_flg =", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotEqualTo(String value) {
            addCriterion("del_flg <>", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThan(String value) {
            addCriterion("del_flg >", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("del_flg >=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThan(String value) {
            addCriterion("del_flg <", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThanOrEqualTo(String value) {
            addCriterion("del_flg <=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLike(String value) {
            addCriterion("del_flg like", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotLike(String value) {
            addCriterion("del_flg not like", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgIn(List<String> values) {
            addCriterion("del_flg in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotIn(List<String> values) {
            addCriterion("del_flg not in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgBetween(String value1, String value2) {
            addCriterion("del_flg between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotBetween(String value1, String value2) {
            addCriterion("del_flg not between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}