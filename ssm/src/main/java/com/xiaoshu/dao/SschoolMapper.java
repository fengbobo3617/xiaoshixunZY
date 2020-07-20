package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Sschool;
import com.xiaoshu.entity.SschoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SschoolMapper extends BaseMapper<Sschool> {
    long countByExample(SschoolExample example);

    int deleteByExample(SschoolExample example);

    List<Sschool> selectByExample(SschoolExample example);

    int updateByExampleSelective(@Param("record") Sschool record, @Param("example") SschoolExample example);

    int updateByExample(@Param("record") Sschool record, @Param("example") SschoolExample example);
}