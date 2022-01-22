package com.felipe.feign.client.rest.client.configuration;

import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import com.felipe.feign.client.rest.feign.DefaultRetryer;
import com.felipe.feign.client.rest.feign.MyErrorDecoder;
import feign.Contract;
import feign.Retryer;
import feign.codec.ErrorDecoder;

public class HelloConfiguration {

  @Bean
  public Contract feignContract() {
    return new SpringMvcContract();
  }

  @Bean
  public Retryer feignRetryer() {
    return new DefaultRetryer(3, 1);
  }
  
  @Bean
  public ErrorDecoder feignErrorDecoder() {
    return new MyErrorDecoder();
  }
  
}
