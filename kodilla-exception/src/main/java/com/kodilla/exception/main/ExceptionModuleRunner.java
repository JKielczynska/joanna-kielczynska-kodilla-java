package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;


public class ExceptionModuleRunner {
    /**
     * Class reads data from .txt file.
     */
    public static void main(final String[] args) {

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}