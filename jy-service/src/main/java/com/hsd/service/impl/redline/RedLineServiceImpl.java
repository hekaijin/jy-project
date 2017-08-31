package com.hsd.service.impl.redline;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.hsd.dao.fundstatement.RedLineUpdateRecordMapper;
import com.hsd.entity.fundstatement.RedLineUpdateRecord;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hsd.admin.statements.dto.PageBean;
import com.hsd.dao.fundstatement.RedLineMapper;
import com.hsd.entity.fundstatement.RedLine;
import com.hsd.service.redline.RedLineService;
import com.hsd.vo.RedLineVo;

@Service("redLineService")
public class RedLineServiceImpl implements RedLineService {

	Logger logger = Logger.getLogger(RedLineServiceImpl.class);

	@Autowired
	RedLineMapper redLineMapper;
	@Autowired
	RedLineUpdateRecordMapper redLineUpdateRecordMapper;

	@Override
	public PageBean<RedLineVo> getRedLineByPage(String id, String fieldName, Integer page) {

		PageBean<RedLineVo> pageBean = new PageBean<RedLineVo>();
		if (null != id && !"".equals(id) && id.length() > 0) {
			List<RedLineVo> list = redLineMapper.selectRedLineList(id, null);
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
		totalCount = redLineMapper.selectRedLineCount(null,fieldName);
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
		List<RedLineVo> list = redLineMapper.selectRedLineList(null, fieldName);
		pageBean.setList(list);// 一定要记得设置到list里

		return pageBean;

	}

	@Override
	public int saveRedLine(RedLine redLine) {
		redLine.setRedlineid(UUID.randomUUID().toString().replaceAll("-", ""));
		redLine.setCreatedate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		redLine.setFlag(0);
		logger.info("新增了红线=============id：" + redLine.getRedlineid());
		return redLineMapper.insertSelective(redLine);
	}

	@Override
	public int editRedLineById(RedLine redLine) {
		logger.info("修改了红线=============id：" + redLine.getRedlineid());

		RedLineUpdateRecord rur=new RedLineUpdateRecord();
		rur.setId(UUID.randomUUID().toString().replaceAll("-",""));
		rur.setUserid(Integer.parseInt(redLine.getUserId()));
		rur.setRedlineid(redLine.getRedlineid());
		rur.setFieldid(redLine.getFieldid());
		rur.setExpensesreimbursementredline(redLine.getExpensesreimbursementredline());
		rur.setSubscriberedline(redLine.getSubscribeRedLine());
		rur.setPredictincome(redLine.getPredictIncome());
		rur.setCreatedate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		rur.setRemark(redLine.getRemark());
		rur.setFlag(0);

		return redLineUpdateRecordMapper.insertSelective(rur);
	}

	@Override
	public int deleteRedLine(String redLine) {
		logger.info("删除了红线=============id：" + redLine);
		return redLineMapper.deleteByRedLineId(redLine);
	}

	@Override
	public String getPermission(String userId) {
		// 
		if(null==userId){
			return null;
		}
		 List<String> intent=redLineMapper.selectPermissionByUserId(userId);
		if(null==intent){
			return null;
		}
		 for (String str : intent) {
			if(null!=str&&str.indexOf("manager.all.fields")!=-1){
				return "yes";
			}
		}
		 
		 return "no";
	}

	@Override
	public String getFieldNameByUserId(String userId) {
		//  
		return redLineMapper.selectFieldNameByUserId(userId);
	}

	@Override
	public String getFieldIDByUserId(String userId) {
		//
		return redLineMapper.selectFieldIDByUserId(userId);
	}

	@Override
	public List<RedLineVo> getRedLineRecordByRedLineId(String redid) {
		return redLineMapper.selectRedLineRecord(redid);
	}

}
