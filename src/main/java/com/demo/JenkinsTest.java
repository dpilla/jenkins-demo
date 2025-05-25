package com.demo;

public class JenkinsTest {
    public String sayHello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println(new JenkinsTest().sayHello());
    }
}