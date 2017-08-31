package com.hsd.service.redline;

import java.util.List;

import com.hsd.admin.statements.dto.PageBean;
import com.hsd.entity.fundstatement.ProjectIncome;
import com.hsd.vo.ProjectIncomeVo;

public interface ProjectIncomeService {

	int isExistByProjectIncome(String projectName, String money, String genre, String date);

	int insertprojectIncome(ProjectIncome pivo);

	String getFieldidByProjectName(String projectname);

	PageBean<ProjectIncomeVo> getProjectIncomeLists(String id,String fieldName, String date, Integer page);

    int saveProjectIncome(ProjectIncome pi);

	int editProjectIncomeById(ProjectIncome pi);

	void deleteProjectIncome(String id);

	List<ProjectIncomeVo> getProjectIncomeLists2(String fieldName);
}
