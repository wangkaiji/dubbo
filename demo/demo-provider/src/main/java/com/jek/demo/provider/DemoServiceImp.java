package com.jek.demo.provider;

import com.jek.demo.DemoService;

public class DemoServiceImp implements DemoService{
    public String sayHello(String name){
        return "Hi "+name+" !";
    }
}
