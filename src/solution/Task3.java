package solution;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        try {
            int[] numbers = new int[scanner.nextInt()];
            System.out.println("Элементы массива кратные 3: ");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
                if ((numbers[i] % 3) == 0) {
                    System.out.print(numbers[i] + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Допустимый тип данных для ввода - целые числа!");
            System.out.println(e.toString());
        }
    }
}
