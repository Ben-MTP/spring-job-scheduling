package com.jindo.core.scheduling;

import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 5/9/2022
 * @project spring-job-scheduling
 */
@Component("myBean")
public class MyBean {
    public void printMessage(){
        System.out.println("---> Calling by Spring Scheduler");
    }
}
