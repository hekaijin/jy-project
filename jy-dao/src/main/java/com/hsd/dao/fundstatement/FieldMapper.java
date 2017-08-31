package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.Field;
import com.hsd.entity.fundstatement.FieldExample;
import java.util.List;

public interface FieldMapper {
    int deleteByPrimaryKey(Integer fieldid);

    int insert(Field record);

    int insertSelective(Field record);

    List<Field> selectByExample(FieldExample example);

    Field selectByPrimaryKey(Integer fieldid);

    int updateByPrimaryKeySelective(Field record);

    int updateByPrimaryKey(Field record);

	List<Field> selectFieldIdAndName();
}