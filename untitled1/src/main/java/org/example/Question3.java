package org.example;

public class Question3 {
    public static void main(String[] args) {
        doSmth();
    }
    private static void doSmth(){
         try {
             System.out.println("Hello");
             doSmth();
         }finally {
             System.out.println("World");
         }
    }
}
