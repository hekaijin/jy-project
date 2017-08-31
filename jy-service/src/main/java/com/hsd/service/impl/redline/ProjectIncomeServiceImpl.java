package com.hsd.service.impl.redline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hsd.admin.statements.dto.PageBean;
import com.hsd.dao.fundstatement.ProjectIncomeMapper;
import com.hsd.entity.fundstatement.ProjectIncome;
import com.hsd.service.redline.ProjectIncomeService;
import com.hsd.vo.ProjectIncomeVo;
import com.hsd.vo.RedLineVo;

@Service("projectIncomeService")
public class ProjectIncomeServiceImpl implements ProjectIncomeService {


	@Autowired
	ProjectIncomeMapper projectIncomeMapper;
	
	@Override
	public int isExistByProjectIncome(String fieldID, String money, String genre, String date) {
		 
		return projectIncomeMapper.seleProjectIncome(fieldID,money,genre,date);
	}

	@Override
	public int insertprojectIncome(ProjectIncome pivo) {
		 return projectIncomeMapper.insertSelective(pivo);
	}

	@Override
	public String getFieldidByProjectName(String projectname) {
		 
		return projectIncomeMapper.selectFieldidByProjectName(projectname);
	}



	@Override
	public PageBean<ProjectIncomeVo> getProjectIncomeLists(String id,String fieldName, String date, Integer page) {

		PageBean<ProjectIncomeVo> pageBean = new PageBean<ProjectIncomeVo>();
		if (null != id && !"".equals(id) && id.length() > 0) {
			List<ProjectIncomeVo> list = projectIncomeMapper.selectProjectIncomeList(id, null,null);
			pageBean.setList(list);
			return pageBean;
		}
		if (null == page || "".equals(page)) {
			page = 1;
		}
		// 设置当前页数：
		if (page == 0) {
			page = 1;
		}
		pageBean.setPage(page);
		// 设置每页显示的记录数：
		Integer pageSize = 10;
		pageBean.setLimit(pageSize);
		// 设置总记录数
		int totalCount = 0;
		totalCount = projectIncomeMapper.selectProjectIncomeCount(fieldName,date);
		pageBean.setTotalCount(totalCount);
		// 设置总页数：
		int totalPage = 0;
		if (totalCount % pageSize == 0) {
			totalPage = totalCount / pageSize;
		} else {
			totalPage = totalCount / pageSize + 1;
		}
		pageBean.setTotalPage(totalPage);
		
		// 从哪开始
		int begin = (page - 1) * pageSize;
		// 每页显示的数据集合：
		PageHelper.offsetPage(begin, pageSize);
		List<ProjectIncomeVo> list = projectIncomeMapper.selectProjectIncomeList(null,fieldName,date);
		pageBean.setList(list);// 一定要记得设置到list里

		return pageBean;

	}

	@Override
	public int saveProjectIncome(ProjectIncome pi) {
		return projectIncomeMapper.insertSelective(pi);
	}

	@Override
	public int editProjectIncomeById(ProjectIncome pi) {
		return projectIncomeMapper.updateByPrimaryKeySelective(pi);
	}

	@Override
	public void deleteProjectIncome(String id) {
		projectIncomeMapper.deleteById(id);
	}

	@Override
	public List<ProjectIncomeVo> getProjectIncomeLists2(String fieldName) {
		return projectIncomeMapper.selectProjectIncomeListV2(fieldName);
	}

}
