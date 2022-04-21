package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void printTaskNumber(int number) {
        System.out.println("========");
        System.out.println("Задача №" + number);
    }

    public static void findLeapYear(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println(i + " — високосный год");
        } else {
            System.out.println(i + " — не високосный год");
        }
    }

    public static void applicationVersion(int operatingSystem, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        if (operatingSystem == 0) {
            if (yearOfIssue >= currentYear) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (operatingSystem == 1) {
            if (yearOfIssue >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateDeliveryDay(int distance) {
        int deliveryDay = 1;
        if (distance >= 0 && distance <= 20) {
            return deliveryDay;
        }
        for (int i = 20; i < distance; i = i + 40) {
            deliveryDay ++;
        }
        return deliveryDay;
    }

    public static void findDouble(String symbol) {
        char y = 0;
        for (int i = 0; i < symbol.length(); i++) {
            if (symbol.charAt(i) != y) {
                y = symbol.charAt(i);
            } else {
                System.out.println("Повторяется символ: " + y);
                System.out.println("Выполнение цикла прервано");
                break;
            }
            if (i == symbol.length() - 1) {
                System.out.println("Повторяющихся символов не обнаружено");
            }
        }
    }

    public static void expandArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int y;
            y = array[i] + array[array.length - 1 - i];
            array[i] = y - array[i];
            array[array.length - 1 - i] = y - array[i];
        }
    }

    public static void main(String[] args) {

        printTaskNumber(1);
        {
            int year = 2022;
            findLeapYear(year);
        }

        printTaskNumber(2);
        {
            int os = 1;
            int year = 2022;
            applicationVersion(os, year);
        }

        printTaskNumber(3);
        {
            int deliveryDistance = 95;
            int deliveryDay = calculateDeliveryDay(deliveryDistance);
            System.out.println("Колличество дней доставки составит: " + deliveryDay);
        }

        printTaskNumber(4);
        {
            String twin = ("aabccddefgghiijjkk");
            findDouble(twin);
        }

        printTaskNumber(5);
        {
            int[] arr = {3, 2, 1, 6, 5};
            expandArray(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}