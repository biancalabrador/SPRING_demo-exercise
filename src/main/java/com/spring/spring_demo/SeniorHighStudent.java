package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy  
public class SeniorHighStudent implements Student {
  @Override
  public String getDailyAssignment() {
      return "Study advanced mathematics!";
  }
}