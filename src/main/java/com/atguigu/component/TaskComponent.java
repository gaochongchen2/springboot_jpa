package com.atguigu.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Component
public class TaskComponent {

    //@Scheduled(fixedDelay = 3000)
    //@Scheduled(fixedRate = 3000)
    @Scheduled(cron = "0/5 * * * * *")
    public void myTask() throws InterruptedException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(s.format(new Date()));
        //Thread.sleep(5000);
    }
}
