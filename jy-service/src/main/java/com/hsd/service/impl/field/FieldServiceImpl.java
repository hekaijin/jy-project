package com.hsd.service.impl.field;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsd.dao.fundstatement.FieldMapper;
import com.hsd.entity.fundstatement.Field;
import com.hsd.service.field.FieldService;

@Service("field")
public class FieldServiceImpl implements FieldService {

	@Autowired
	FieldMapper fieldMapper;
	
	
	@Override
	public List<Field> getFieldIdAndNames() {
		 
		return fieldMapper.selectFieldIdAndName();
	}

 

}
