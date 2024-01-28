import task1.ValidNumbers;
import task2.UserJson;
import task3.FrequencyWords;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
//        Task 1
        new ValidNumbers().showValidNumbers("./files/file.txt");
//        Task 2
        new UserJson().createUserJson("./files/filetask2.txt", "./files/user.json");
//        Task 3
        new FrequencyWords().showFrequencyWords("./files/words.txt");
    }
}
