package com.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 10; i++) {
            System.out.print(+i);
        }
        System.out.println("\n");
        int start = 10;
        while (start > 0) {
            System.out.print(start);
            start--;
        }
        System.out.println("\n");
        for (int friday = 5; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("\n");
        for (int yearCometa = 0; yearCometa <= 2122; yearCometa = yearCometa + 79) {
        if (yearCometa >=1822 && yearCometa <=2122) {
            System.out.println(+yearCometa);}
        }
    }
}







