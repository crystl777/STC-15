package ru.butenko.task13;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EncoderText {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите директорию исходного файла для записи");
        String directory = reader.readLine();
        //Path path = Paths.get("src/ru/butenko/task13/utf-8.txt");
        Path path = Paths.get(directory);

        try (OutputStream os = Files.newOutputStream(path)) {
            System.out.println("Введите текст");
            String text = reader.readLine();
            os.write(text.getBytes());
        }

        //здесь я просто решил посмотреть размер полученного выше файла
        System.out.println(Files.size(path));


        System.out.println("Введите директорию для перекодированного файла");
        //Path newEncoderPath = Paths.get("src/ru/butenko/task13/ascii.txt");
        String encoderDirectory = reader.readLine();
        Path newEncoderPath = Paths.get(encoderDirectory);

        /*
        try (InputStream is = Files.newInputStream(path);
             OutputStream os = Files.newOutputStream(newEncoderPath)) {

            byte[] buf = Files.readAllBytes(path);

            while (is.read(buf) != -1) {

                String text = new String(buf, StandardCharsets.US_ASCII);
                os.write(text.getBytes());
            }
        }

         */

        try (InputStreamReader isr = new InputStreamReader(Files.newInputStream(path));
             OutputStreamWriter osw = new OutputStreamWriter(Files.newOutputStream(newEncoderPath),
                     StandardCharsets.US_ASCII)) {


            while (isr.ready()) {
                osw.write(isr.read());
            }
        }
    }
}

