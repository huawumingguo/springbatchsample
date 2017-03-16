package com.yp.batch;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        String[] springConfig = { "applicationContext.xml" };
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("helloWorldJob");
        JobExecution execution = jobLauncher.run(job, new JobParameters());
        log.info("Exit Status : " + execution.getStatus());
        context.close();
    }
}