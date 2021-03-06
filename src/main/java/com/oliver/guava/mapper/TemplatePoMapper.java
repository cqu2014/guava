package com.oliver.guava.mapper;

import com.oliver.guava.dao.TemplatePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("templatePoMapper")
public interface TemplatePoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TemplatePo record);

    int insertSelective(TemplatePo record);

    TemplatePo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TemplatePo record);

    int updateByPrimaryKeyWithBLOBs(TemplatePo record);

    int updateByPrimaryKey(TemplatePo record);

    TemplatePo queryTemplate(@Param("brand") String brand,@Param("emailType") String emailType);
}