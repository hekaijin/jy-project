package com.hsd.service.contractpay;

import java.util.List;

import com.hsd.vo.ProjectMonthIncomeVo;

public interface ContractPayService {
	
	List<ProjectMonthIncomeVo> getProjectMonthIncomeDetails(String projectName);
}
