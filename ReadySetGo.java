//На старт! Внимание! Марш!
//
//По правилам велогонки, после квалификации каждый гонщик стартует с задержкой на секунду больше, чем у гонщика перед ним.
//Первый гонщик стартует на счёт 3. Напишите программу, которая сможет автоматизировать старт всех гонщиков, участвующих в велогонке.
//
//Формат ввода
//Вводится одно натуральное число — количество участников велогонки.
//
//Формат вывода
//Требуется вывести отсчёт.

import java.util.Scanner;

public class ReadySetGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countRiders = Integer.parseInt(scanner.nextLine());
        int countdown = 3;
        int queue = 0;

        for (int startingNumber = 1; startingNumber <= countRiders; startingNumber++) {
            for (int sec = countdown + queue; sec != 0; sec--) {
                System.out.format("До старта %d секунд(ы)\n", sec);
            }
            queue++;
            System.out.format("Старт %d!!!\n", startingNumber);
        }
    }
}
