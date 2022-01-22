package com.felipe.feign.client.rest.feign;

import feign.RetryableException;
import feign.Retryer;

public class DefaultRetryer extends Retryer.Default {

  private int maxAttempts;
  private int counter;
  
  public DefaultRetryer(int maxAttempts, int counter) {
    this.maxAttempts = maxAttempts;
    this.counter = counter;
  }
  
  @Override
  public void continueOrPropagate(RetryableException exception) {
    if (counter++ > maxAttempts) {
      throw exception;
    }
    
    System.out.println(String.format("retrying %s..", exception.request().url()));
    super.continueOrPropagate(exception);
  }

  @Override
  public Retryer clone() {
    return new DefaultRetryer(maxAttempts, counter);
  }
}
