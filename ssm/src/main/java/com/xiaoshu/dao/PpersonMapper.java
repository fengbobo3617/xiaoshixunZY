package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Pperson;
import com.xiaoshu.entity.PpersonExample;
import com.xiaoshu.entity.PpersonVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PpersonMapper extends BaseMapper<Pperson> {
    long countByExample(PpersonExample example);

    int deleteByExample(PpersonExample example);

    List<Pperson> selectByExample(PpersonExample example);

    int updateByExampleSelective(@Param("record") Pperson record, @Param("example") PpersonExample example);

    int updateByExample(@Param("record") Pperson record, @Param("example") PpersonExample example);

	List<PpersonVo> findAllPperson(PpersonVo ppersonVo);

	List<PpersonVo> findPperson(PpersonVo ppersonVo);
}