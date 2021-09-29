package com.fyndna.sampleproject.controller;

import com.fyndna.sampleproject.DTO.MessageDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {
    List<MessageDTO> getMessages = new ArrayList<>();

    public Controller() {
        getMessages.add(new MessageDTO("001","Hello"));
        getMessages.add(new MessageDTO("0002","Hello Madhi"));
        getMessages.add(new MessageDTO("003","Hello Ravi"));
        getMessages.add(new MessageDTO("004","Hello Sandiya"));
    }


    @GetMapping(path = "/getMessageList")
    public List<MessageDTO> getMessageList(){
        return getMessages;
    }
    @GetMapping(path = "/getMessage")
    public MessageDTO getSingleMessage(){
        return new MessageDTO("002","Lets Do It!");
    }

    @GetMapping(value="/getCurrentDateTime")
    public Date getMethodName() {
        return new Date();
    }

}
