package com.example.spring.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SomeClassA {
    SomeClassB someClassB;

    public SomeClassA(SomeClassB someClassB) {
        this.someClassB = someClassB;
    }

    void doSomething() {
        System.out.println("SomeClassA");
    }
}
