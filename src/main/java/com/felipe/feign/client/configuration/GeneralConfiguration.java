package com.felipe.feign.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

@Configuration
public class GeneralConfiguration {

  @Bean
  public MeterRegistry meterRegistry() {
    return new SimpleMeterRegistry();
  }
  
}
