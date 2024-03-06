package com.example.spring.example.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
        // Input : 1, 2, 5, 4, 4, 5, 2, 3, 6, 5 Output:
        //Map<String, Integer>
        //<"1-hello": 1>,
        //<"2-hello": 2>,
        //<"3-hello": 1>,
        //<"5-hello": 3>
        //
        //public static Map<String, Long> transform(final Integer... nums) {
        //result;
        //}

        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);

        Map<Integer, Long> countMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        // Создание новой карты, где ключи будут иметь формат "число-hello", а значения будут соответствовать количеству вхождений
        Map<String, Long> resultMap = countMap.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey() + "-hello", Map.Entry::getValue));

        // Вывод результата
        resultMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
