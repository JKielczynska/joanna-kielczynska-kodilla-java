package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;


public class ExceptionModuleRunner {
    /**Class reads data from .txt file.*/
    public static void main(final String[] args) {

        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
