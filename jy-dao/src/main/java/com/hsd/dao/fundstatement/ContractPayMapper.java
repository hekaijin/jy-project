package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.ContractPay;
import com.hsd.entity.fundstatement.ContractPayExample;
import com.hsd.vo.ProjectMonthIncomeVo;
import com.hsd.vo.RankingDetailVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ContractPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContractPay record);

    int insertSelective(ContractPay record);

    List<ContractPay> selectByExample(ContractPayExample example);

    ContractPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContractPay record);

    int updateByPrimaryKey(ContractPay record);

	String selectAllProjectIncomeTotalMoney(@Param("fieldId")String fieldId);

	List<RankingDetailVo> selectProjectIncomeDetail();
	
	List<ProjectMonthIncomeVo> selectProjectMonthIncomeDetails(@Param("projectName")String projectName);
}