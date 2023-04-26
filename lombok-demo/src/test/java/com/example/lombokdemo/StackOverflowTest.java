package com.example.lombokdemo;

import org.junit.jupiter.api.Test;

public class StackOverflowTest {

    @Test
    void loop() {
        A a = new A();
        B b = new B();
        b.setA(a);
        a.setB(b);

        System.out.println(b);
    }
}
