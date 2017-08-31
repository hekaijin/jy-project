package com.hsd.service.redline;

import com.hsd.admin.statements.dto.PageBean;
import com.hsd.entity.fundstatement.RedLine;
import com.hsd.vo.RedLineVo;

import java.util.List;

public interface RedLineService {

	PageBean<RedLineVo> getRedLineByPage(String id,String fieldName,Integer page);

	int saveRedLine(RedLine redLine);

	int editRedLineById(RedLine redLine);

	int deleteRedLine(String string);

	String getPermission(String userId);

	String getFieldNameByUserId(String userId);

    String getFieldIDByUserId(String userId);

    List<RedLineVo> getRedLineRecordByRedLineId(String redid);
}
