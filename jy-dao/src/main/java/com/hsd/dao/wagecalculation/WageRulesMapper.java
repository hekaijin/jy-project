package com.hsd.dao.wagecalculation;

import com.hsd.entity.wagecalculation.WageRules;
import com.hsd.entity.wagecalculation.WageRulesExample;
import java.util.List;

public interface WageRulesMapper {
    int deleteByPrimaryKey(String id);

    int insert(WageRules record);

    int insertSelective(WageRules record);

    List<WageRules> selectByExample(WageRulesExample example);

    WageRules selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WageRules record);

    int updateByPrimaryKey(WageRules record);
}