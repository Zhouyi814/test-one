package com.shen.autocoding.engine.mapper;

import com.shen.autocoding.engine.model.SysRoleModule;
import com.shen.autocoding.engine.model.SysRoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleModuleMapper {
    int countByExample(SysRoleModuleExample example);

    int deleteByExample(SysRoleModuleExample example);

    int deleteByPrimaryKey(String roleModuleId);

    int insert(SysRoleModule record);

    int insertSelective(SysRoleModule record);

    List<SysRoleModule> selectByExample(SysRoleModuleExample example);

    SysRoleModule selectByPrimaryKey(String roleModuleId);

    int updateByExampleSelective(@Param("record") SysRoleModule record, @Param("example") SysRoleModuleExample example);

    int updateByExample(@Param("record") SysRoleModule record, @Param("example") SysRoleModuleExample example);

    int updateByPrimaryKeySelective(SysRoleModule record);

    int updateByPrimaryKey(SysRoleModule record);
}