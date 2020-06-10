package com.shen.autocoding.engine.mapper;

import com.shen.autocoding.engine.model.TabUser;
import com.shen.autocoding.engine.model.TabUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabUserMapper {
    int countByExample(TabUserExample example);

    int deleteByExample(TabUserExample example);

    int deleteByPrimaryKey(String uid);

    int insert(TabUser record);

    int insertSelective(TabUser record);

    List<TabUser> selectByExample(TabUserExample example);

    TabUser selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") TabUser record, @Param("example") TabUserExample example);

    int updateByExample(@Param("record") TabUser record, @Param("example") TabUserExample example);

    int updateByPrimaryKeySelective(TabUser record);

    int updateByPrimaryKey(TabUser record);
}