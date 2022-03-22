package solution;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int number = scanner.nextInt();

        try {
            if (number > 7) {
                System.out.println("Привет");
            }
            if (number <= 7) {
                System.out.println("Введи число больше 7");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Допустимый тип данных для ввода - целые числа!");
            System.out.println(e.toString());
        }
    }
}

