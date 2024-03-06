package com.example.spring.example.task2.util;

import java.util.List;

public interface ReedFileService {
    /**
     * This method reed file and creates list of lines from the file
     * @param filePath path to the file
     * @return List<String>
     */
    List<String> getStringsListFromFile(String filePath);
}
