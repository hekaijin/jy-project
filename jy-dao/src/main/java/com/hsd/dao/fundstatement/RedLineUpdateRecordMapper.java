package com.hsd.dao.fundstatement;

import com.hsd.entity.fundstatement.RedLineUpdateRecord;
import com.hsd.entity.fundstatement.RedLineUpdateRecordExample;
import java.util.List;

public interface RedLineUpdateRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(RedLineUpdateRecord record);

    int insertSelective(RedLineUpdateRecord record);

    List<RedLineUpdateRecord> selectByExample(RedLineUpdateRecordExample example);

    RedLineUpdateRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RedLineUpdateRecord record);

    int updateByPrimaryKey(RedLineUpdateRecord record);
}