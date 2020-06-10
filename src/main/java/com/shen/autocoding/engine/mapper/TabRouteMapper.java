package com.shen.autocoding.engine.mapper;

import com.shen.autocoding.engine.model.TabRoute;
import com.shen.autocoding.engine.model.TabRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabRouteMapper {
    int countByExample(TabRouteExample example);

    int deleteByExample(TabRouteExample example);

    int deleteByPrimaryKey(String rid);

    int insert(TabRoute record);

    int insertSelective(TabRoute record);

    List<TabRoute> selectByExample(TabRouteExample example);

    TabRoute selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") TabRoute record, @Param("example") TabRouteExample example);

    int updateByExample(@Param("record") TabRoute record, @Param("example") TabRouteExample example);

    int updateByPrimaryKeySelective(TabRoute record);

    int updateByPrimaryKey(TabRoute record);
}