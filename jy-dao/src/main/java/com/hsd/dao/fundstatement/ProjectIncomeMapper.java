package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.ProjectIncome;
import com.hsd.entity.fundstatement.ProjectIncomeExample;
import com.hsd.vo.ProjectIncomeVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProjectIncomeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProjectIncome record);

    int insertSelective(ProjectIncome record);

    List<ProjectIncome> selectByExample(ProjectIncomeExample example);

    ProjectIncome selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProjectIncome record);

    int updateByPrimaryKey(ProjectIncome record);

	int seleProjectIncome(@Param("fieldID")String fieldID, @Param("money")String money, @Param("genre")String genre, @Param("date")String date);

	String selectFieldidByProjectName(@Param("projectName")String projectName);
 
	int selectProjectIncomeCount(@Param("fieldName")String fieldName,@Param("date") String date);

	List<ProjectIncomeVo> selectProjectIncomeList(@Param("id")String id,@Param("fieldName")String fieldName,@Param("date") String date);

    void deleteById(@Param("id")String id);

    List<ProjectIncomeVo> selectProjectIncomeListV2(@Param("fieldName")String fieldName);
}