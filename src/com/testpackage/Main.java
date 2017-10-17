package com.testpackage;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double average;

        int randomNumber = (int) (Math.random() * 20);

        while (randomNumber != 0) {
            sum += randomNumber;
            count++;
            randomNumber = (int) (Math.random() * 20);
        }

        if (count != 0) {
            average = sum / count;
        } else {
            average = 0;
        }

        System.out.println("среднее арифметическое равно " + average);
    }
}
