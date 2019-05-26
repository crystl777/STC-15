package ru.butenko.task13;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EncoderText {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get("src/ru/butenko/task13/utf-8.txt");

        try (OutputStream os = Files.newOutputStream(path)) {
            String text = reader.readLine();
            os.write(text.getBytes());
        }

        //здесь я просто решил посмотреть размер полученного выше файла
        System.out.println(Files.size(path));

        Path newEncoderPath = Paths.get("src/ru/butenko/task13/ascii.txt");
        try (InputStream is = Files.newInputStream(path);
             OutputStream os = Files.newOutputStream(newEncoderPath)) {

            byte[] buf = Files.readAllBytes(path);

            if (is.read(buf) != -1) {
                String text = new String(buf, StandardCharsets.US_ASCII);
                os.write(text.getBytes());
            }
        }
    }
}
