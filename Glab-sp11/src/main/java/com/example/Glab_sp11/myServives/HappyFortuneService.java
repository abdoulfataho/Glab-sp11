package com.example.Glab_sp11.myServives;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}