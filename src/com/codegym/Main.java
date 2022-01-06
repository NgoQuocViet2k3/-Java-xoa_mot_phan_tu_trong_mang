package com.codegym;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Viet", "Binh", "Toan", "Luyt"};
        System.out.println("---Mảng ban đầu---");
        for (String element : array) {
            System.out.println(element);
        }

        System.out.println("---Mảng sau khi xóa---");
        String[] newArray = removeElementFromArray(array, 3);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static String[] removeElementFromArray(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }
}