package com.example.shop.controller;

import com.example.shop.model.ChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private static final Logger log = LoggerFactory.getLogger(ChatController.class);

    @MessageMapping("/message")
    @SendTo("/topic")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        log.info(chatMessage.getContent());
        return chatMessage;
    }
}