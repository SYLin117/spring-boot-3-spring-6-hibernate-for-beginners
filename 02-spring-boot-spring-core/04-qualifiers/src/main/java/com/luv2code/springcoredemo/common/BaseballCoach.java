package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Primary // you can use @Primary instead of using @Qualifier
// but @Qualifier has higher priority
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
