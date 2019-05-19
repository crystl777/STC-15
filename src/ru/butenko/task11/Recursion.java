package ru.butenko.task11;

import java.io.File;
import java.io.IOException;

public class Recursion {

    public static void main(String[] args) throws IOException {

        //создаём вложенные директории и файлы

        new File("src/ru/butenko/task11/dirA").mkdir();
        new File("src/ru/butenko/task11/dirA/dirB").mkdir();
        new File("src/ru/butenko/task11/dirA/a.txt").createNewFile();
        new File("src/ru/butenko/task11/dirA/dirB/b.txt").createNewFile();

        recursiveBypass(new File("src/ru/butenko/task11/dirA"));

    }
     private static void recursiveBypass (File dir) throws IOException {
        File[] files = dir.listFiles();

         for (File file : files) {
             if(file.isFile()){
                 System.out.println(file.getPath());
             }
             else {
                 recursiveBypass(file);
             }
         }
         System.out.println(dir.getPath());
    }
}
