package com.hsd.action;

import java.util.List;

import com.hsd.util.JyPermissionUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsd.service.borrow.BorrowService;
import com.hsd.service.contractpay.ContractPayService;
import com.hsd.service.expensesreimbursement.ExpensesReimbursementService;
import com.hsd.service.field.FieldService;
import com.hsd.service.fieldmoney.FieldMoneyService;
import com.hsd.vo.CostCountVo;
import com.hsd.vo.IncomeFeeVo;
/**
 * 資金報表controller
 * @author Administrator
 *
 */
import com.hsd.vo.IncomeSituationVo;
import com.hsd.vo.ProjectMonthIncomeVo;
import com.hsd.vo.RankingDetailVo;
import com.hsd.vo.StaffWageAndReimbursementVo;
import com.hsd.vo.StatementVo;
import com.hsd.vo.StatisticsPredictAndReality;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/fundstatement")
public class FundstatementController {
	
	Logger logger=Logger.getLogger(FundstatementController.class);
	
	@Autowired
	BorrowService borrowService;
	@Autowired
	ExpensesReimbursementService expensesReimbursementService;
	@Autowired
	FieldService fieldService;
	@Autowired
	FieldMoneyService fieldMoneyService;
	@Autowired
	ContractPayService contractPayService;
	
	
	
	/**
	 * 查询所有项目(总成本,总收入，总利润)
	 * @return
	 */
	@RequestMapping(value="/getProjectCostingAll",method=RequestMethod.POST)
	@ResponseBody
	public IncomeSituationVo getProjectCostingAll(String userId, HttpServletRequest request){



		JyPermissionUtil.setPermissions(userId,request);
		String isPermission=JyPermissionUtil.getPermissions(request);
		String fieldId=JyPermissionUtil.getFieldID(userId);
		if(null!=isPermission&&"yes".equalsIgnoreCase(isPermission)){
			return borrowService.getProjectCostingTotalMoney(null);
		}else if (null!=isPermission&&"no".equalsIgnoreCase(isPermission)){
			return borrowService.getProjectCostingTotalMoney(fieldId);
		}

		IncomeSituationVo isVo=new IncomeSituationVo();
		isVo.setTotalcosting("235039684.00");
		isVo.setTotalincome("263800070.00");
		isVo.setTotalprofit("28760386.00");
		return isVo;

	}
	
	
	
	/**111
	 * 总成本，总利润，总收入 排行详情
	 */
	@RequestMapping(value="/getProjectRankingDetail",method=RequestMethod.POST)
	@ResponseBody
	public List<RankingDetailVo> getProjectRankingDetail(String flag){
		
		return borrowService.getProjectRankingDetails(flag);
	}
	
	
	/**111
	 * 项目的月份成本情况
	 */
	@RequestMapping(value="/getProjectMonthCostingDetail",method=RequestMethod.POST)
	@ResponseBody
	public List<ProjectMonthIncomeVo> getProjectMonthCostingDetail(String projectName){
		
		return borrowService.getProjectMonthCostingDetails(projectName);
		
	}
	
	/**111
	 * 项目的月份收入情况
	 */
	@RequestMapping(value="/getProjectMonthIncomeDetail",method=RequestMethod.POST)
	@ResponseBody
	public List<ProjectMonthIncomeVo> getProjectMonthIncomeDetail(String projectName){
		
		return contractPayService.getProjectMonthIncomeDetails(projectName);
		
	}
	
	
	
	/**111
	 * 项目的月份利润情况
	 */
	@RequestMapping(value="/getProjectMonthProfitDetail",method=RequestMethod.POST)
	@ResponseBody
	public List<ProjectMonthIncomeVo> getProjectMonthProfitDetail(String projectName){
		
		return borrowService.getProjectMonthProfitDetails(projectName);
		
	}
	
	
	
	/**111
	 * 月度报表
	 */
	@RequestMapping(value="/getMonthStatement",method=RequestMethod.POST)
	@ResponseBody
	public StatementVo getMonthStatement(String month,@RequestParam(value = "fieldName", required = false)String fieldName){
		 
		return borrowService.getMonthStatements(month,fieldName);
		
	}
	
	
	/**111
	 * 年度报表
	 */
	@RequestMapping(value="/getYearStatement",method=RequestMethod.POST)
	@ResponseBody
	public StatementVo getYearStatement(String year,@RequestParam(value = "fieldName", required = false)String fieldName){
		
		return borrowService.getYearStatements(year,fieldName);
		
	}
	
	
	/**111
	 * 月度报表-收入、投入、赢利统计
	 */
	@RequestMapping(value="/getMonthStatementCount",method=RequestMethod.POST)
	@ResponseBody
	public List<StatisticsPredictAndReality> getMonthStatementCount(String month,String fieldId){
		
		return borrowService.getMonthStatementCount(month,fieldId);
		
	}
	
	/**111
	 * 年度报表-收入、投入、赢利统计
	 */
	@RequestMapping(value="/getYearStatementCount",method=RequestMethod.POST)
	@ResponseBody
	public List<StatisticsPredictAndReality> getYearStatementCount(String year,String fieldId){
		
		return borrowService.getYearStatementCount(year,fieldId);
		
	}
	
	/**111
	 * 月度报表-收入统计-饼状图
	 */
	@RequestMapping(value="/getMonthStatementIncomeCount",method=RequestMethod.POST)
	@ResponseBody
	public List<CostCountVo> getMonthStatementIncomeCount(String month,String fieldId){
		
		return borrowService.getMonthStatementIncomeCounts(month,fieldId);
		
	} 
	
	/**111
	 * 月度报表-收入统计-费用详情-饼状图
	 */
	@RequestMapping(value="/getMonthStatementIncomeData",method=RequestMethod.POST)
	@ResponseBody
	public List<IncomeFeeVo> getMonthStatementIncomeData(String month,String fieldId,String feeName){
		
		return borrowService.getMonthStatementIncomeDatas(month,fieldId,feeName);
		
	} 
	
	
	
	
	/**111
	 * 年度报表-收入统计-饼状图
	 */
	@RequestMapping(value="/getYearStatementIncomeCount",method=RequestMethod.POST)
	@ResponseBody
	public List<CostCountVo> getYearStatementIncomeCount(String year,String fieldId){
		
		return borrowService.getYearStatementIncomeCounts(year,fieldId);
		
	} 
	
	
	/**111
	 * 年度报表-收入统计-费用详情-饼状图
	 */
	@RequestMapping(value="/getYearStatementIncomeData",method=RequestMethod.POST)
	@ResponseBody
	public List<IncomeFeeVo> getYearStatementIncomeData(String year,String fieldId,String feeName){
		
		return borrowService.getYearStatementIncomeDatas(year,fieldId,feeName);
		
	} 
	
	
	
	/**111
	 * 月度报表-投入统计-饼状图
	 */
	@RequestMapping(value="/getMonthStatementInjectCount",method=RequestMethod.POST)
	@ResponseBody
	public List<CostCountVo> getMonthStatementInjectCount(String month,String fieldId){
		
		return borrowService.getMonthStatementInjectCounts(month,fieldId);
		
	} 
	
	
	/**111
	 * 月度报表-投入统计-详情-饼状图
	 */
	@RequestMapping(value="/getMonthStatementInjectData",method=RequestMethod.POST)
	@ResponseBody
	public List<StaffWageAndReimbursementVo> getMonthStatementInjectData(String date,String fieldId,String feeName){
		
		return borrowService.getMonthStatementInjectDatas(date,fieldId,feeName);
		
	} 
	
	
	
	
	
	/**111
	 * 年度报表-投入统计-饼状图
	 */
	@RequestMapping(value="/getYearStatementInjectCount",method=RequestMethod.POST)
	@ResponseBody
	public List<CostCountVo> getYearStatementInjectCount(String year,String fieldId){
		
		return borrowService.getYearStatementInjectCounts(year,fieldId);
		
	} 
	
	
	
	/**111
	 * 月度报表-盈利统计-饼状图
	 */
	@RequestMapping(value="/getMonthStatementProfitCount",method=RequestMethod.POST)
	@ResponseBody
	public List<CostCountVo> getMonthStatementProfitCount(String month,String fieldId){
		
		return borrowService.getMonthStatementProfitCounts(month,fieldId);
		
	} 
	
	
	/**111
	 * 年度报表-盈利统计-饼状图
	 */
	@RequestMapping(value="/getYearStatementProfitCount",method=RequestMethod.POST)
	@ResponseBody
	public List<CostCountVo> getYearStatementProfitCount(String year,String fieldId){
		
		return borrowService.getYearStatementProfitCounts(year,fieldId);
		
	} 
	 
}
