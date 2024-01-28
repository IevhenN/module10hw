package task1;

import mylib.Reader;

import java.io.*;
import java.util.ArrayList;

public class ValidNumbers {
    public void showValidNumbers(String fileName) throws IOException {

        FormatCheck formatCheck = new FormatCheck();

        ArrayList<String> numbers = Reader.readFileAsLines(fileName);

        for (String number : numbers) {
            if (formatCheck.checkFormat(number)) {
                System.out.println(number);
            }
        }

    }
}
