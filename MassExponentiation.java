//Массовое возведение в степень
//
//Часто возникают трудности, когда нужно выполнить множество однообразных операций.
//В таких случаях люди желают упростить себе работу. Напишите программу, которая возводит
//в заданную степень все числа, что передали пользователи.
//
//Формат ввода
//Вводится натуральное число N — количество чисел.
//В каждой из последующих N строк записано по одному числу.
//В последней строке записано натуральное число P — степень, в которую требуется возвести числа.
//
//Формат вывода
//Последовательность чисел, являющихся ответом.

import java.util.Scanner;
import java.util.ArrayList;

public class MassExponentiation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int totalNumbers = scanner.nextInt();

        for (int i = 0; i < totalNumbers; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int power = scanner.nextInt();

        for (int num : numbers) {
            System.out.println((long) Math.pow(num, power));
        }
    }
}
