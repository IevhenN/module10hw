package mylib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Writer {
    public static void writeFile(String fileName, String text) throws IOException {
        File file = new File(fileName);

        File dir = file.getParentFile();
        if (!dir.exists()) {
            dir.mkdirs();
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(text.getBytes(StandardCharsets.UTF_8));
        outputStream.close();

    }
}
