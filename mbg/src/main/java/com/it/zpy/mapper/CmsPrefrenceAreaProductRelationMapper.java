package com.it.zpy.mapper;

import com.it.zpy.model.CmsPrefrenceAreaProductRelation;
import com.it.zpy.model.CmsPrefrenceAreaProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaProductRelationMapper {
    long countByExample(CmsPrefrenceAreaProductRelationExample example);

    int deleteByExample(CmsPrefrenceAreaProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    List<CmsPrefrenceAreaProductRelation> selectByExample(CmsPrefrenceAreaProductRelationExample example);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    int updateByExample(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}