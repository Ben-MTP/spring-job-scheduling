package com.jindo.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ManhKM on 5/9/2022
 * @project spring-job-scheduling
 */
public class App {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("scheduler-conf.xml");
        System.out.println("--->> Spring Job Scheduling Running >>>");
    }
}
