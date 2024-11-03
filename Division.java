//Обработка деления на ноль.
//
//Описание:
//Напишите программу, которая считывает из файла два числа (a b) и делит первое (a) на второе (b).
//Гарантируется, что a >= b.
//Обработайте возможное исключение деления на ноль.
//
//Подсказка:
//Используйте блок try-catch для обработки ArithmeticException.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Division {
    public static void main(String[] args) {

        try {
            File file = new File("Numbers");

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbersInt = new int[2];
            int count = 0;

            for (String number : numbersString) {
                numbersInt[count++] = Integer.parseInt(number);
            }

            try {
                int result = numbersInt[0] / numbersInt[1];
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Делить на ноль нельзя!");
                e.printStackTrace();
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

    }
}
