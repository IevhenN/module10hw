package mylib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Reader {

    static File openFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден!");
        }

        return file;
    }

    public static ArrayList<String> readFileAsLines(String fileName) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        File file;

        try {
            file = openFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + fileName);
            return result;
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNextLine()) {
            result.add(scanner.nextLine());
        }

        fileInputStream.close();

        return result;
    }

    public static String[] readFileToArray(String fileName) throws IOException {
        StringJoiner allToString = new StringJoiner("/n");
        File file;

        try {
            file = openFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + fileName);
            return new String[]{};
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNextLine()) {
            allToString.add(scanner.nextLine());
        }
        fileInputStream.close();

        return allToString.toString().replace("/n", " ").split(" ");
    }
}
