//Дни недели.
//
//Передать на вход программы число от 1 до 7 в качестве аргумента.
//Если число равно 1, выводим на консоль “Понедельник”, 2 – "Вторник" и так далее. Если 6 или 7 – “Выходной”.
//Используйте конструкцию switch.

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        switch (day) {
            case 1 -> {
                System.out.println("Понедельник");
            }
            case 2 -> {
                System.out.println("Вторник");
            }
            case 3 -> {
                System.out.println("Среда");
            }
            case 4 -> {
                System.out.println("Четверг");
            }
            case 5 -> {
                System.out.println("Пятница");
            }
            case 6, 7 -> {
                System.out.println("Выходной");
            }
            default -> {
                System.out.println("Введите число от 1 до 7");
            }

        }

    }
}
