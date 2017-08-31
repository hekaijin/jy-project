package com.hsd.service.Artificial;

import com.hsd.admin.statements.dto.PageBean;
import com.hsd.vo.WageCalculationVo;

public interface WageCalculationService {

    public PageBean<WageCalculationVo> getWageCalculationListsByPage(String id,String fieldName,String userName,String rulesName,Integer page);
}
