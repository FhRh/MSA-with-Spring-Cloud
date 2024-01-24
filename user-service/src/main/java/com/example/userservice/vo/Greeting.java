package com.example.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value; //헷갈리지 말것
import org.springframework.stereotype.Component;

@Data
@Component
public class Greeting {
    @Value("${greeting.message}")
    String message;
}
