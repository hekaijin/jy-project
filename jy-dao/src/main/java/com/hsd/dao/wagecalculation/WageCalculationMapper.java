package com.hsd.dao.wagecalculation;

import com.hsd.entity.wagecalculation.WageCalculation;
import com.hsd.entity.wagecalculation.WageCalculationExample;
import com.hsd.vo.WageCalculationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WageCalculationMapper {
    int deleteByPrimaryKey(String id);

    int insert(WageCalculation record);

    int insertSelective(WageCalculation record);

    List<WageCalculation> selectByExample(WageCalculationExample example);

    WageCalculation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WageCalculation record);

    int updateByPrimaryKey(WageCalculation record);

    List<WageCalculationVo> selectWageCalculationList(@Param("id") String id,@Param("fieldName") String fieldName,@Param("userName") String userName, @Param("rulesName")String rulesName);

    int selectWageCalculationCount(@Param("id") String id,@Param("fieldName") String fieldName,@Param("userName") String userName, @Param("rulesName")String rulesName);
}