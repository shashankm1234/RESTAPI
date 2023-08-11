package com.example.SpringCrud.Model.Response;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class TicketInfo {
  private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
