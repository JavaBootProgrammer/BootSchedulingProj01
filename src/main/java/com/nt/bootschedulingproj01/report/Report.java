package com.nt.bootschedulingproj01.report;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

public class Report {

    @Scheduled(initialDelay = 3000, fixedDelay = 3000)
    public void generateReport() {
        System.out.println("Report generated"+ new Date());

    }
}
