package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.RedLine;
import com.hsd.entity.fundstatement.RedLineExample;
import com.hsd.vo.RedLineVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RedLineMapper {
    int deleteByPrimaryKey(Integer redlineid);

    int insert(RedLine record);

    int insertSelective(RedLine record);

    List<RedLine> selectByExample(RedLineExample example);

    RedLine selectByPrimaryKey(Integer redlineid);

    int updateByPrimaryKeySelective(RedLine record);

    int updateByPrimaryKey(RedLine record);

	List<RedLineVo> selectRedLineList(@Param("id")String id, @Param("fieldName")String fieldName);

	int selectRedLineCount(@Param("id")String id, @Param("fieldName")String fieldName);

	int deleteByRedLineId(@Param("redLine")String redLine);

	List<String> selectPermissionByUserId(@Param("userId")String userId);

	String selectFieldNameByUserId(@Param("userId")String userId);

    String selectFieldIDByUserId(@Param("userId")String userId);

    List<RedLineVo> selectRedLineRecord(@Param("redid")String redid);
}