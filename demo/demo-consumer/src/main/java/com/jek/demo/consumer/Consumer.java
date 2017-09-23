package com.jek.demo.consumer;

import com.jek.demo.DemoService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String args[]){
        String[] locations = new String[]{"META-INF/spring/demo-consumer.xml"};
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(locations);
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("jek"));
    }

}
