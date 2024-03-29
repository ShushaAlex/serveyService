package com.example.spring.example.task2.util.impl;

import com.example.spring.example.task2.util.ReedFileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReedFileServiceImpl implements ReedFileService {
    @Override
    public List<String> getStringsListFromFile(String filePath) {
        try (FileInputStream inputStream = new FileInputStream(filePath);
             InputStreamReader reader = new InputStreamReader(inputStream);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            return lines;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
