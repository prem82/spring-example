package com.smileprem.hello;

import org.springframework.stereotype.Component;

@Component
public class HiMessageService implements MessageService {

  public String getMessage() {
    return "Hi ";
  }

}
