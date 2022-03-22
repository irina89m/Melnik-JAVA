package solution;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        /** IF */
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        if (!name.equals("Вячеслав")) {
            System.out.println("Нет такого имени");
        }

        /** IF..ELSE */
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        /** WHILE */
        while (!name.equals("Вячеслав")) {
            System.out.println("Нет такого имени");
            break;
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }

        /** SWITCH..CASE */
        switch (name) {
            case ("Вячеслав"):
                System.out.println("Привет, Вячеслав");
                break;
            default:
                System.out.println("Нет такого имени");
                break;
        }
    }
}



