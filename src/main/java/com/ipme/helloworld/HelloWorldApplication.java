package com.ipme.helloworld;

import org.apache.commons.lang3.StringUtils;
import sun.applet.Main;

import java.util.Properties;

public class HelloWorldApplication {
    public static void main(String[] args) {

        //System.out.println("Hello World !");

        Properties prop = new Properties();
        try {
            prop.load(HelloWorldApplication.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String devops = prop.getProperty("devops.config");

        //System.out.println(devops);

        String devops_uppercase = StringUtils.upperCase(devops);

        System.out.println(devops_uppercase.toString());


    }
}