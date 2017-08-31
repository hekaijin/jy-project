package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.ExpensesReimbursement;
import com.hsd.entity.fundstatement.ExpensesReimbursementExample;
import java.util.List;

public interface ExpensesReimbursementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpensesReimbursement record);

    int insertSelective(ExpensesReimbursement record);

    List<ExpensesReimbursement> selectByExample(ExpensesReimbursementExample example);

    ExpensesReimbursement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpensesReimbursement record);

    int updateByPrimaryKey(ExpensesReimbursement record);
}