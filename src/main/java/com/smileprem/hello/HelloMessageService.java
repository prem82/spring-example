package com.smileprem.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloMessageService implements MessageService {

  public String getMessage() {
    return "Hello ";
  }



}
