package com.felipe.feign.client.rest.feign;

import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;

public class MyErrorDecoder implements ErrorDecoder {

  @Override
  public Exception decode(String s, Response response) {
    return new RetryableException(1, "aaa", feign.Request.HttpMethod.GET, null, response.request());
  }
}
