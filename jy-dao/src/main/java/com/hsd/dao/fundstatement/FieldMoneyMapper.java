package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.FieldMoney;
import com.hsd.entity.fundstatement.FieldMoneyExample;
import java.util.List;

public interface FieldMoneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FieldMoney record);

    int insertSelective(FieldMoney record);

    List<FieldMoney> selectByExample(FieldMoneyExample example);

    FieldMoney selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FieldMoney record);

    int updateByPrimaryKey(FieldMoney record);
}