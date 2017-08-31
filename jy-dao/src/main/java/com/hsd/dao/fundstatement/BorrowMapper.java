package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.Borrow;
import com.hsd.entity.fundstatement.BorrowExample;
import com.hsd.entity.fundstatement.FieldStatement;
import com.hsd.vo.CostCountVo;
import com.hsd.vo.IncomeFeeVo;
import com.hsd.vo.ProjectMonthIncomeVo;
import com.hsd.vo.RankingDetailVo;
import com.hsd.vo.StaffWageAndReimbursementVo;
import com.hsd.vo.StatisticsPredictAndReality;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BorrowMapper {
    int deleteByPrimaryKey(Integer borrowid);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    List<Borrow> selectByExample(BorrowExample example);

    Borrow selectByPrimaryKey(Integer borrowid);

    int updateByPrimaryKeySelective(Borrow record);

    int updateByPrimaryKey(Borrow record);

	String selectAllProjectCostingTotalMoney(@Param("fieldId")String fieldId);

	List<RankingDetailVo> selectProjectCostingDetail();

	List<ProjectMonthIncomeVo> selectProjectMonthCostingDetails(@Param("projectName")String projectName);

	List<RankingDetailVo> selectProjectProfitDetail();

	List<ProjectMonthIncomeVo> selectProjectMonthProfitDetails(@Param("projectName")String projectName);

	String selectTotalIncomeByMonth(@Param("month")String month);

	String selectTotalInjectByMonth(@Param("month")String month);

	String selectTotalExpenditureByMonth(@Param("month")String month);

	LinkedList<String> selectProfitTotalByMonthAndProject(@Param("month")String month, @Param("fieldName")String fieldName);

	LinkedList<String> selectInjectMoneyByMonthAndProject(@Param("month")String month, @Param("fieldName")String fieldName);

	LinkedList<String> selectExpenditureMoneyByMonthAndProject(@Param("month")String month, @Param("fieldName")String fieldName);

	HashMap<String, String> selectIdAndFieldNameByFieldName(@Param("fieldName")String fieldName);

	String selectTotalIncomeByYear(@Param("year")String year);

	String selectTotalInjectByYear(@Param("year")String year);

	String selectTotalExpenditureByYear(@Param("year")String year);

	String selectProfitTotalByYearAndProject(@Param("year")String year, @Param("fieldName")String fieldName);

	String selectInjectMoneyByYearAndProject(@Param("year")String year, @Param("fieldName")String fieldName);

	String selectExpenditureMoneyByYearAndProject(@Param("year")String year, @Param("fieldName")String fieldName);
	
	
	
	
	

	List<FieldStatement> selectListMonthStatements(@Param("month")String month, @Param("fieldName")String fieldName);

	List<FieldStatement> selectListYearStatements(@Param("year")String year, @Param("fieldName")String fieldName);

	StatisticsPredictAndReality selectIncomeStatisticsByMonthAndFieldId(@Param("month")String month, @Param("fieldId")String fieldId);

	StatisticsPredictAndReality selectInjectStatisticsByMonthAndFieldId(@Param("month")String month, @Param("fieldId")String fieldId);

	StatisticsPredictAndReality selectProfitStatisticsByMonthAndFieldId(@Param("month")String month, @Param("fieldId")String fieldId);
	

	StatisticsPredictAndReality selectIncomeStatisticsByYearAndFieldId(@Param("year")String year, @Param("fieldId")String fieldId);

	StatisticsPredictAndReality selectInjectStatisticsByYearAndFieldId(@Param("year")String year, @Param("fieldId")String fieldId);

	StatisticsPredictAndReality selectProfitStatisticsByYearAndFieldId(@Param("year")String year, @Param("fieldId")String fieldId);

	List<CostCountVo> selectMonthStatementIncomeCounts(@Param("month")String month, @Param("fieldId")String fieldId);

	List<CostCountVo> selectYearStatementIncomeCounts(@Param("year")String year, @Param("fieldId")String fieldId);

	List<CostCountVo> selectMonthStatementInjectCounts(@Param("month")String month, @Param("fieldId")String fieldId);

	List<IncomeFeeVo> selectMonthStatementIncomeDatas(@Param("month")String month,@Param("fieldId")String fieldId,@Param("feeName")String feeName);

	List<IncomeFeeVo> selectYearStatementIncomeDatas(@Param("year")String year,@Param("fieldId")String fieldId,@Param("feeName")String feeName);

	List<CostCountVo> getYearStatementInjectCounts(@Param("year")String year, @Param("fieldId")String fieldId);

	List<StaffWageAndReimbursementVo> selectMonthStatementInjectDatasByStaffWage(@Param("date")String date, @Param("fieldId")String fieldId);
	
	List<StaffWageAndReimbursementVo> selectMonthStatementInjectDatasByReimbursement(@Param("date")String date, @Param("fieldId")String fieldId,@Param("feeName")String feeName);

	List<CostCountVo> selectMonthStatementProfitCounts(@Param("month")String month, @Param("fieldId")String fieldId);

	List<CostCountVo> selectYearStatementProfitCounts(@Param("year")String year, @Param("fieldId")String fieldId);
	
	

	
}