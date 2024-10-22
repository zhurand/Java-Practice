//Таблица умножения
//
//Местная фабрика канцелярских товаров заказала у вас программу, которая генерирует таблицы умножения.
//Давайте поддержим локального производителя!
//
//Формат ввода
//Вводится одно натуральное число — требуемый размер таблицы.
//
//Формат вывода
//Таблица умножения заданного размера.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tableSize = scanner.nextInt();

        for (int head = 1; head <= tableSize; head++) {
            System.out.print(head + " ");
            if (head == tableSize) {
                System.out.println();
            }
        }

        for (int column = 2; column <= tableSize; column++) {
            System.out.print(column + " ");
            for (int digit = 2; digit <= tableSize; digit++) {
                System.out.print(digit * column + " ");
            }
            System.out.println();
        }
    }
}
