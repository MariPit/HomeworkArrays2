package hw1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(100_000) + 100_000;
        }

        System.out.println("Задание 1");
        int sum = 0;
        for (int expense : expenses) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println("Задание 3");
        double average=(double) sum/ expenses.length;
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int n=reverseFullName.length-1; n>=0; n--) {
            System.out.print(reverseFullName[n]);
        }
        return expenses;
    }
}