package com.example.shop.controller;

import com.example.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        redisTemplate.opsForValue().set(user.getId(), user);
        return user;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        User user = (User) redisTemplate.opsForValue().get(id);
        if (user != null) {
            String destination = "/topic/user/" + id;
            messagingTemplate.convertAndSend(destination, user);
        }
        return user;
    }
}
