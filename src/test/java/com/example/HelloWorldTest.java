package com.example;

import org.junit.jupiter.api.Test;

import com.demo.JenkinsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {

    @Test
    public void testSayHello() {
        JenkinsTest hw = new JenkinsTest();
        String result = hw.sayHello();
        assertEquals("Hello, World!", result);
    }
    
    @Test
    public void testSayHelloTest() {
        JenkinsTest hw = new JenkinsTest();
        String result = hw.sayHello();
        assertEquals("Hello, Worl1d!", result);
    }
}