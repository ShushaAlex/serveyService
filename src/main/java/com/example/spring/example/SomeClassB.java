package com.example.spring.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SomeClassB {
    SomeClassA someClassA;

    public SomeClassB(SomeClassA someClassA) {
        this.someClassA = someClassA;
    }
}
