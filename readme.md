# Spring Job Scheduling

## Why config scheduler in file config
* When config in file -> easy change when change business.
* If using config in Java Code -> need rebuild project -> file jar -> deploy...

## Guide step by step:
* Step 1:
    * Create a new maven project -> for build Spring Core
    
* Step 2:
    * Create a new Bean -> have one or more method
    
* Step 3:
    * Create a file config: resource/scheduler-conf.xml
    * Config refer to Bean + method


## Spring Task Cron Expression 
     ┌───────────── second (0-59)
     │ ┌───────────── minute (0 - 59)
     │ │ ┌───────────── hour (0 - 23)
     │ │ │ ┌───────────── day of the month (1 - 31)
     │ │ │ │ ┌───────────── month (1 - 12) (or JAN-DEC)
     │ │ │ │ │ ┌───────────── day of the week (0 - 7)
     │ │ │ │ │ │          (or MON-SUN -- 0 or 7 is Sunday)
     │ │ │ │ │ │
     * * * * * *

    0 0 * * * *    -> top of every hour of every day
    */10 * * * * * -> every ten seconds
    0 0 8-10 * * * -> 8, 9 and 10 o’clock of every day
    0 0 8 * * *    -> 8 o’clock of every day

## Reference document
* [Spring Job Scheduling using TaskScheduler (XML Config)](http://websystique.com/spring/spring-job-scheduling-using-xml-configuration/)
* [Improved Cron Expression](https://spring.io/blog/2020/11/10/new-in-spring-5-3-improved-cron-expressions)
