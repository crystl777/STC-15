package ru.butenko.task11;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) throws IOException {

        //создаём вложенные директории и файлы
        File file = new File("src/ru/butenko/task11/dirA");
        file.mkdir();
        new File("src/ru/butenko/task11/dirA/dirB").mkdir();
        new File("src/ru/butenko/task11/dirA/a.txt").createNewFile();
        new File("src/ru/butenko/task11/dirA/dirB/b.txt").createNewFile();
     // recursiveBypass(new File("src/ru/butenko/task11/dirA"));
        recursiveChangeName(new File("src/ru/butenko/task11/dirA"), 0);

    }
    //рекурсивный обход всех файлов и подкаталогов внутри заданного каталога
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
    private static void recursiveChangeName(File dir, int recursionDepth) {

        File[] files = dir.listFiles();
        String space = "X"; //для наглядности вместо пробела сделал Х
        for (File file : files) {
            if (file.isFile()) {
                for (int i = 0; i < recursionDepth; i++) {
                    file.renameTo(new File(file.getParent() + "/" + space + file.getName()));
                    space += "X";
                }

            } else {

                recursiveChangeName(file, recursionDepth + 1);
            }
        }
    }
}

