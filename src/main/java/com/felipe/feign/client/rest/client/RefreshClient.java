package com.felipe.feign.client.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "refresh", url = "http://localhost:1234")
public interface RefreshClient {

  @PostMapping("/actuator/refresh")
  void refresh();
  
}
