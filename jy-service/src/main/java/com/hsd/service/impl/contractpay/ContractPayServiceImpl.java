package com.hsd.service.impl.contractpay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsd.dao.fundstatement.ContractPayMapper;
import com.hsd.service.contractpay.ContractPayService;
import com.hsd.vo.ProjectMonthIncomeVo;

@Service("contractPayService")
public class ContractPayServiceImpl implements ContractPayService {

	@Autowired
	ContractPayMapper contractPayMapper;
	
	 

	@Override
	public List<ProjectMonthIncomeVo> getProjectMonthIncomeDetails(String projectName) {
		 
		return contractPayMapper.selectProjectMonthIncomeDetails(projectName);
	}

}
