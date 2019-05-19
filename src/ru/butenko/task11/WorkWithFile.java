package ru.butenko.task11;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class WorkWithFile {

    public static void main(String[] args) {


    //создаём новый файл с использованием класса File

        File file = new File("src/ru/butenko/task11/example.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            System.out.println("не удалось создать файл " + e.getMessage());
        }


    //производим переименование ранее созданного файла

        File fileNew = new File("src/ru/butenko/task11/exampleNew.txt");
        System.out.println(file.renameTo(fileNew));


    //производим создание новой директории

        File dir = new File("src/ru/butenko/task11/newDir");
        System.out.println(dir.mkdir());


    //производим копирование файла в новую директорию

        Path path = fileNew.toPath();
        Path targetFilePath = Paths.get("src/ru/butenko/task11/newDir/exampleNew.txt");

        try {
            Files.copy(path, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("не удалось скопировать файл в новую директорию " + dir.getName() + e.getMessage());
        }

    //производим удаление скопированного файла

        try {
            System.out.println(Files.deleteIfExists(Paths.get("src/ru/butenko/task11/newDir/exampleNew.txt")));
        } catch (IOException e) {
            System.out.println("не удалось удалить файл по причине " + e.getMessage());
        }
    }
}
