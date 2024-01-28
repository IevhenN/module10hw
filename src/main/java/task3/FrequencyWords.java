package task3;

import mylib.Reader;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FrequencyWords {
    public void showFrequencyWords(String fileName) throws IOException {
        String[] arrWords = Reader.readFileToArray(fileName);
        HashMap<String, Integer> wordCounter = new HashMap<>();

        for (int i = 0; i < arrWords.length; i++) {
            if (wordCounter.containsKey(arrWords[i])) {
                wordCounter.put(arrWords[i], wordCounter.get(arrWords[i]) + 1);
            } else {
                wordCounter.put(arrWords[i], 1);
            }
        }

        wordCounter.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
