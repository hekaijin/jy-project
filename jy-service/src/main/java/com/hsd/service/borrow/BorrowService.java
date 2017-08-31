package com.hsd.service.borrow;

import java.util.List;

import com.hsd.vo.CostCountVo;
import com.hsd.vo.IncomeFeeVo;
import com.hsd.vo.IncomeSituationVo;
import com.hsd.vo.ProjectMonthIncomeVo;
import com.hsd.vo.RankingDetailVo;
import com.hsd.vo.StaffWageAndReimbursementVo;
import com.hsd.vo.StatementVo;
import com.hsd.vo.StatisticsPredictAndReality;

public interface BorrowService {

	IncomeSituationVo getProjectCostingTotalMoney(String userId);

	List<RankingDetailVo> getProjectRankingDetails(String flag);

	List<ProjectMonthIncomeVo> getProjectMonthCostingDetails(String projectName);

	List<ProjectMonthIncomeVo> getProjectMonthProfitDetails(String projectName);

	StatementVo getMonthStatements(String month, String fieldName);

	StatementVo getYearStatements(String year, String fieldName);

	List<StatisticsPredictAndReality> getMonthStatementCount(String month, String fieldId);

	List<StatisticsPredictAndReality> getYearStatementCount(String year, String fieldId);

	List<CostCountVo> getMonthStatementIncomeCounts(String month, String fieldId);

	List<CostCountVo> getYearStatementIncomeCounts(String year, String fieldId);

	List<CostCountVo> getMonthStatementInjectCounts(String month, String fieldId);

	List<IncomeFeeVo> getMonthStatementIncomeDatas(String month,String fieldId,String feeName);

	List<IncomeFeeVo> getYearStatementIncomeDatas(String year, String fieldId, String feeName);

	List<CostCountVo> getYearStatementInjectCounts(String year, String fieldId);

	List<StaffWageAndReimbursementVo> getMonthStatementInjectDatas(String date, String fieldId, String feeName);

	List<CostCountVo> getMonthStatementProfitCounts(String month, String fieldId);

	List<CostCountVo> getYearStatementProfitCounts(String year, String fieldId);


	

}
