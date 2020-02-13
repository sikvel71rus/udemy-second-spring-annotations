package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    //define a defult constructor

    public TennisCoach(){
        System.out.println(">>Tenniscoach inside default constructor");
    }



    /*
    //define a setter method
    @Autowired
    public void setFortuneService(FortuneService thefortuneService){
        System.out.println(">>Tenniscoach inside setter method");
        fortuneService = thefortuneService;
    }



    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

     */

    @Override
    public String getDailyWorkout() {
        return "Practice more boya";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
