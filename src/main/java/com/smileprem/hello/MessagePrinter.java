package com.smileprem.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

  @Autowired
  private HiMessageService service;

  // construction injection
  // @Autowired
  // public MessagePrinter(HiMessageService service) {
  // this.service = service;
  // }

  public void printMessage() {
    System.out.println(this.service.getMessage());
  }
}
