package com.hsd.dao.wagecalculation;

import com.hsd.entity.wagecalculation.EalaryGenre;
import com.hsd.entity.wagecalculation.EalaryGenreExample;
import java.util.List;

public interface EalaryGenreMapper {
    int deleteByPrimaryKey(String id);

    int insert(EalaryGenre record);

    int insertSelective(EalaryGenre record);

    List<EalaryGenre> selectByExample(EalaryGenreExample example);

    EalaryGenre selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EalaryGenre record);

    int updateByPrimaryKey(EalaryGenre record);
}