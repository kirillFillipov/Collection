package HomeWork;

import java.util.Scanner;

public class Collection2 {
    public static void main(String[] args) {
        sortarr();
    }
    private static void sortarr() {
        String[] array = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + ( i + 1 ) + " слово: ");
            array[i] = scanner.nextLine();
        }

        String a = array[0];

        for(String el:array){
            if(el.length() > a.length()){
                a = el;
            }
        }

        for(String el:array){
            if(el.length() == a.length()){
                System.out.println(el);
            }
        }
    }
}