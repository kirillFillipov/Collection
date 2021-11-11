package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {

        slovarr();

    }

    public static void slovarr() {
        List<String> arr = new ArrayList<>(List.of("Kirill", "Home", "Car", "Valera", "Russia"));

        System.out.println(arr.size());

        for (String el: arr) {
            System.out.println(el);
        }

    }
}