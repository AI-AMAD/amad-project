package com.amad.toyproject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amad.toyproject.service.AmadService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AmadController {

  private final AmadService service;

  @GetMapping("/getAll")
  public List<Map<Object, Object>> getAll() {
    List<Map<Object, Object>> result = service.getAll();
    log.info("getAll 실행 되었습니다.");
    return result;
  }
}
