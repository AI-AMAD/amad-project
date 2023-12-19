package com.amad.toyproject.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmadMapper {

    public List<Map<Object, Object>> getAll();

}
