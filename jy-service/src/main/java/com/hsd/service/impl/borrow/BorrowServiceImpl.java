package com.hsd.service.impl.borrow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsd.dao.fundstatement.BorrowMapper;
import com.hsd.dao.fundstatement.ContractPayMapper;
import com.hsd.entity.fundstatement.FieldStatement;
import com.hsd.service.borrow.BorrowService;
import com.hsd.vo.CostCountVo;
import com.hsd.vo.IncomeFeeVo;
import com.hsd.vo.IncomeSituationVo;
import com.hsd.vo.ProjectMonthIncomeVo;
import com.hsd.vo.RankingDetailVo;
import com.hsd.vo.StaffWageAndReimbursementVo;
import com.hsd.vo.StatementVo;
import com.hsd.vo.StatisticsPredictAndReality;

@Service("borrowService")
public class BorrowServiceImpl implements BorrowService {

	@Autowired
	BorrowMapper borrowMapper;
	@Autowired
	ContractPayMapper contractPayMapper;

	@Override
	public IncomeSituationVo getProjectCostingTotalMoney(String fieldId) {

		IncomeSituationVo incomeSituatio = new IncomeSituationVo();

		incomeSituatio.setTotalcosting(borrowMapper.selectAllProjectCostingTotalMoney(fieldId));
		incomeSituatio.setTotalincome(contractPayMapper.selectAllProjectIncomeTotalMoney(fieldId));
		incomeSituatio.setTotalprofit("0");

		return incomeSituatio;
	}

	@Override
	public List<RankingDetailVo> getProjectRankingDetails(String flag) {

		if (flag.equals("totalincome")) {
			return contractPayMapper.selectProjectIncomeDetail();//1
		} else if (flag.equals("totalprofit")) {//利润
			return borrowMapper.selectProjectProfitDetail();//1
		} else if (flag.equals("totalcosting")) {
			return borrowMapper.selectProjectCostingDetail();//1
		}

		return null;

	}

	@Override
	public List<ProjectMonthIncomeVo> getProjectMonthCostingDetails(String projectName) {

		return borrowMapper.selectProjectMonthCostingDetails(projectName);
	}

	@Override
	public List<ProjectMonthIncomeVo> getProjectMonthProfitDetails(String projectName) {

		return borrowMapper.selectProjectMonthProfitDetails(projectName);
	}

	@Override
	public StatementVo getMonthStatements(String month, String fieldName) {

		StatementVo statementVo = new StatementVo();

		// 按月查询总盈利
		String totalProfit = borrowMapper.selectTotalIncomeByMonth(month);
		statementVo.setTotalProfit(totalProfit);

		// 按月查询总投入
		String totalInject = borrowMapper.selectTotalInjectByMonth(month);
		statementVo.setTotalInject(totalInject);

		// 按月查询总花费
		String totalExpenditure = borrowMapper.selectTotalExpenditureByMonth(month);
		statementVo.setTotalExpenditure(totalExpenditure);

		// 按月按项目查询月度报表
		List<FieldStatement> fsList = borrowMapper.selectListMonthStatements(month, fieldName);
		 

//		// 按月按项目查询盈利总计
//		LinkedList<String> profitTotal = borrowMapper.selectProfitTotalByMonthAndProject(month, fieldName);
//		for (int i=0;i<profitTotal.size();i++) {
//			
//			fieldStatement.setProfitTotal(profitTotal);
//		}
//
//		// 按月按项目查询投入资金
//		LinkedList<String> injectMoney = borrowMapper.selectInjectMoneyByMonthAndProject(month, fieldName);
//		for (int i=0;i<injectMoney.size();i++) {
//			
//			fieldStatement.setInjectMoney(injectMoney);
//		}
//
//		// 按月按项目查询花费资金
//		LinkedList<String> expenditureMoney = borrowMapper.selectExpenditureMoneyByMonthAndProject(month, fieldName);
//		for (int i=0;i<expenditureMoney.size();i++) {
//			
//			fieldStatement.setExpenditureMoney(expenditureMoney);
//		}
//
//		// 查询项目名称
//		HashMap<String, String> map = borrowMapper.selectIdAndFieldNameByFieldName(fieldName);
//		if(null !=map &&map.size()>0){
//			fieldStatement.setFieldName(map.get("Name"));
//			fieldStatement.setFieldId(String.valueOf(map.get("FieldID")));
//		}
		
		 
		statementVo.setFieldStatement(fsList);

		return statementVo;
	}

	@Override
	public StatementVo getYearStatements(String year, String fieldName) {

		StatementVo statementVo = new StatementVo();

		// 按年查询总盈利
		String totalProfit = borrowMapper.selectTotalIncomeByYear(year);
		statementVo.setTotalProfit(totalProfit);

		// 按年查询总投入
		String totalInject = borrowMapper.selectTotalInjectByYear(year);
		statementVo.setTotalInject(totalInject);

		// 按年查询总花费
		String totalExpenditure = borrowMapper.selectTotalExpenditureByYear(year);
		statementVo.setTotalExpenditure(totalExpenditure);

		// 按年按项目查询月度报表
		List<FieldStatement> fsList = borrowMapper.selectListYearStatements(year, fieldName);
//		FieldStatement fieldStatement = new FieldStatement();
//
//		// 按年按项目查询盈利总计
//		String profitTotal = borrowMapper.selectProfitTotalByYearAndProject(year, fieldName);
//		fieldStatement.setProfitTotal(profitTotal);
//
//		// 按年按项目查询投入资金
//		String injectMoney = borrowMapper.selectInjectMoneyByYearAndProject(year, fieldName);
//		fieldStatement.setInjectMoney(injectMoney);
//
//		// 按年按项目查询花费资金
//		String expenditureMoney = borrowMapper.selectExpenditureMoneyByYearAndProject(year, fieldName);
//		fieldStatement.setExpenditureMoney(expenditureMoney);
//		
//		// 查询项目名称
//		HashMap<String, String> map = borrowMapper.selectIdAndFieldNameByFieldName(fieldName);
//		if(null !=map &&map.size()>0){
//			fieldStatement.setFieldName(map.get("Name"));
//			fieldStatement.setFieldId(String.valueOf(map.get("FieldID")));
//		}		
//
//		fsList.add(fieldStatement);
		statementVo.setFieldStatement(fsList);

		return statementVo;
	}

	@Override
	public List<StatisticsPredictAndReality> getMonthStatementCount(String month, String fieldId) {
		
		List<StatisticsPredictAndReality> sparList=new  ArrayList<StatisticsPredictAndReality>();
		 
		StatisticsPredictAndReality spar1=borrowMapper.selectIncomeStatisticsByMonthAndFieldId(month,fieldId);
		StatisticsPredictAndReality spar2=borrowMapper.selectInjectStatisticsByMonthAndFieldId(month,fieldId);
		StatisticsPredictAndReality spar3=borrowMapper.selectProfitStatisticsByMonthAndFieldId(month,fieldId);
		
		sparList.add(null==spar1?new StatisticsPredictAndReality("收入统计","0","0"):spar1);
		sparList.add(null==spar2?new StatisticsPredictAndReality("投入统计","0","0"):spar2);
		sparList.add(null==spar3?new StatisticsPredictAndReality("盈利统计","0","0"):spar3);
		
		return sparList;
	}
	
	
	@Override
	public List<StatisticsPredictAndReality> getYearStatementCount(String year, String fieldId) {
		
		List<StatisticsPredictAndReality> sparList=new  ArrayList<StatisticsPredictAndReality>();
		StatisticsPredictAndReality spar1= borrowMapper.selectIncomeStatisticsByYearAndFieldId(year,fieldId);
		StatisticsPredictAndReality spar2= borrowMapper.selectInjectStatisticsByYearAndFieldId(year,fieldId);
		StatisticsPredictAndReality spar3= borrowMapper.selectProfitStatisticsByYearAndFieldId(year,fieldId);
		 
		sparList.add(null==spar1?new StatisticsPredictAndReality("收入统计","0","0"):spar1);  
		sparList.add(null==spar2?new StatisticsPredictAndReality("投入统计","0","0"):spar2);  
		sparList.add(null==spar3?new StatisticsPredictAndReality("盈利统计","0","0"):spar3); 
		return sparList;
	}

	@Override
	public List<CostCountVo> getMonthStatementIncomeCounts(String month, String fieldId) {
		
		return borrowMapper.selectMonthStatementIncomeCounts(month,fieldId);
	}

	@Override
	public List<CostCountVo> getYearStatementIncomeCounts(String year, String fieldId) {
		  
		return borrowMapper.selectYearStatementIncomeCounts(year, fieldId);
	}

	@Override
	public List<CostCountVo> getMonthStatementInjectCounts(String month, String fieldId) {
		 
		return borrowMapper.selectMonthStatementInjectCounts(month,fieldId);
	}

	@Override
	public List<IncomeFeeVo> getMonthStatementIncomeDatas(String month,String fieldId,String feeName) {
		
		return borrowMapper.selectMonthStatementIncomeDatas(month,fieldId,feeName);
	}

	@Override
	public List<IncomeFeeVo> getYearStatementIncomeDatas(String year, String fieldId, String feeName) {
		//  
		return borrowMapper.selectYearStatementIncomeDatas(year,fieldId,feeName);
	}

	@Override
	public List<CostCountVo> getYearStatementInjectCounts(String year, String fieldId) {
		//  
		return borrowMapper.getYearStatementInjectCounts(year,fieldId);
	}

	@Override
	public List<StaffWageAndReimbursementVo> getMonthStatementInjectDatas(String date, String fieldId, String feeName) {
		
		if(null!=feeName&& !"".equals(feeName)&&"员工工资".equals(feeName)){
			
			return borrowMapper.selectMonthStatementInjectDatasByStaffWage(date,fieldId);
		}else{
			
			return borrowMapper.selectMonthStatementInjectDatasByReimbursement(date,fieldId,feeName);
		}
		
		 
	}

	@Override
	public List<CostCountVo> getMonthStatementProfitCounts(String month, String fieldId) {
		 
		return borrowMapper.selectMonthStatementProfitCounts(month,fieldId);
	}

	@Override
	public List<CostCountVo> getYearStatementProfitCounts(String year, String fieldId) {
		//  
		return borrowMapper.selectYearStatementProfitCounts(year,fieldId);
	}
	
	 

}
