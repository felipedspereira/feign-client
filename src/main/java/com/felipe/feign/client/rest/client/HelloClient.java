package com.felipe.feign.client.rest.client;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.felipe.feign.client.rest.client.configuration.HelloConfiguration;

@FeignClient(name = "hello", url = "http://localhost:8080", configuration = HelloConfiguration.class)
@Cacheable(cacheNames = "teste")
public interface HelloClient {

  @GetMapping("/test")
  String get();
  
  @PostMapping("/refresh")
  void refresh();
  
}
