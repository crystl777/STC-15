package ru.butenko.task11;


public class Example {
    public static void main(String[] args) {
       try {
           String s = doSome();
           System.out.println(s);
       } catch (Exception e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }

    private static String doSome() {
        try {
            doElse();
            return  "Good!";
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Perfect");
        }
    }

    private static void doElse() {
        throw new RuntimeException();
    }
}



