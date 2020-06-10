package com.shen.autocoding.engine.mapper;

import com.shen.autocoding.engine.model.TabCategory;
import com.shen.autocoding.engine.model.TabCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabCategoryMapper {
    int countByExample(TabCategoryExample example);

    int deleteByExample(TabCategoryExample example);

    int deleteByPrimaryKey(String cid);

    int insert(TabCategory record);

    int insertSelective(TabCategory record);

    List<TabCategory> selectByExample(TabCategoryExample example);

    TabCategory selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") TabCategory record, @Param("example") TabCategoryExample example);

    int updateByExample(@Param("record") TabCategory record, @Param("example") TabCategoryExample example);

    int updateByPrimaryKeySelective(TabCategory record);

    int updateByPrimaryKey(TabCategory record);
}