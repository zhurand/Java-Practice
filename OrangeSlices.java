//Мы делили апельсин
//
//Аня, Боря и Вова решили съесть апельсин.
//Подскажите ребятам, как им его разделить.
//Напишите программу, которая выводит все возможные способы разделки апельсина.
//
//Формат ввода
//В единственной строке записано количество долек апельсина.
//
//Формат вывода
//Таблица вариантов разделения апельсина.
//
//Примечания
//Каждому ребёнку должна достаться хотя бы одна долька апельсина.
//Ни одной дольки не должно остаться.
//Выводить варианты в порядке увеличения количества долек у Ани, затем Бори и затем уже Вовы.

import java.util.Scanner;

public class OrangeSlices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orangeSlices = scanner.nextInt();

        System.out.println("А Б В");

        for (int a = 1; a < orangeSlices - 1; a++) {
            for (int b = 1; b < orangeSlices - a; b++) {
                int v = orangeSlices - a - b;
                System.out.format("%d %d %d\n", a, b, v);
            }
        }

    }
}
