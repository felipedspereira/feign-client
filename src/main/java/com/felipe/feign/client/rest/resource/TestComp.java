package com.felipe.feign.client.rest.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.felipe.feign.client.rest.client.HelloClient;
import com.felipe.feign.client.rest.client.RefreshClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestComp {

  private final HelloClient hello;
  private final RefreshClient refresh;
  
  @GetMapping(value = "/hello")
//  @PostConstruct
  public void afterCreate() {
    String string = hello.get();
    System.out.println(string);
  }
  
  @GetMapping(value = "/refresh")
  public void refresh() {
    refresh.refresh();
  }
  
}
