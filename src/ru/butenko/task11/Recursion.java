package ru.butenko.task11;

import java.io.File;
import java.io.IOException;

public class Recursion {

    public static void main(String[] args) throws IOException {

        //создаём вложенные директории и файлы
        File file = new File("src/ru/butenko/task11/dirA");
        file.mkdir();
        new File("src/ru/butenko/task11/dirA/dirB").mkdir();
        new File("src/ru/butenko/task11/dirA/dirB/dirC").mkdir();
        new File("src/ru/butenko/task11/dirA/a.txt").createNewFile();
        new File("src/ru/butenko/task11/dirA/dirB/b.txt").createNewFile();

        recursiveBypass(new File("src/ru/butenko/task11/dirA"));
        recursiveChangeName(new File("src/ru/butenko/task11/dirA"), Recursion.recusionDepth(file));
    }

    //рекурсивный обход всех файлов и подкаталогов внутри заданного каталога
    private static void recursiveBypass(File dir) throws IOException {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getPath());
            } else {
                recursiveBypass(file);
            }
        }
        System.out.println(dir.getPath());
    }

    //подсчёт глубины рекурсии
    private static int recusionDepth(File dir) {

        File[] files = dir.listFiles();
        int depth = 0;

        for(File file : files){
            if (file.isDirectory()){
                depth++;
                recusionDepth(file);
            }
        }
        return depth;
    }

    //рекурсивное изменение имени файлов и каталогов в зависимости от глубины рекурсии
    private static void recursiveChangeName(File dir, int recursionDepth) {

        File[] files = dir.listFiles();
        String space = "";
        for (int i = 0; i < recursionDepth; i++) {
            space += "X"; //для наглядности вместо пробела сделал Х
        }

        for (File file : files) {
            File newFile = new File(file.getParent() + "/" + space + file.getName());
            if (file.isDirectory()) {
                System.out.println(file.renameTo(newFile));
                recursiveChangeName(newFile, recursionDepth + 1);
            } else {
                System.out.println(file.renameTo(newFile));
            }
        }
    }
}


