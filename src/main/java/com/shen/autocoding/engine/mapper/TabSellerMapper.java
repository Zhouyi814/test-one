package com.shen.autocoding.engine.mapper;

import com.shen.autocoding.engine.model.TabSeller;
import com.shen.autocoding.engine.model.TabSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabSellerMapper {
    int countByExample(TabSellerExample example);

    int deleteByExample(TabSellerExample example);

    int deleteByPrimaryKey(String sid);

    int insert(TabSeller record);

    int insertSelective(TabSeller record);

    List<TabSeller> selectByExample(TabSellerExample example);

    TabSeller selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") TabSeller record, @Param("example") TabSellerExample example);

    int updateByExample(@Param("record") TabSeller record, @Param("example") TabSellerExample example);

    int updateByPrimaryKeySelective(TabSeller record);

    int updateByPrimaryKey(TabSeller record);
}