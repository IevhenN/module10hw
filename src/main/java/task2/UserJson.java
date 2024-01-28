package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mylib.Reader;
import mylib.Writer;

import java.io.IOException;
import java.util.ArrayList;

public class UserJson {
    public void createUserJson(String fileNameRead, String fileNameWrite) throws IOException {
        ArrayList<String> source = Reader.readFileAsLines(fileNameRead);

        ArrayList<User> users = createUsers(source);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUsers = gson.toJson(users);

        Writer.writeFile(fileNameWrite, jsonUsers);
    }

    ArrayList<User> createUsers(ArrayList<String> source) {

        ArrayList<User> userArrayList = new ArrayList<>();

        if (source.size() < 2) {
            return userArrayList;
        }

        for (int i = 1; i < source.size(); i++) {
            String[] stringUser = source.get(i).split(" ");
            userArrayList.add(new User(stringUser[0], Integer.parseInt(stringUser[1])));
        }

        return userArrayList;
    }
}
