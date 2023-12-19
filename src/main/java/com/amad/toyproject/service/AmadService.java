package com.amad.toyproject.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.amad.toyproject.mybatis.AmadMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AmadService {

  private final AmadMapper mapper;

  public List<Map<Object, Object>> getAll() {
    List<Map<Object, Object>> result = mapper.getAll();
    return result;
  }
}
