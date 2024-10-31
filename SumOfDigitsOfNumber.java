//Сумма цифр числа
//
//Дано натуральное число N. Вычислите сумму его цифр.
//
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
//
//https://ejudge.179.ru/tasks/training/recursion.html

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    private static int sumOfDigitsOfNumber = 0;
    public static int getSumOfDigitsOfNumber(int number) {
        int modifiedNumber = number / 10;
        sumOfDigitsOfNumber = sumOfDigitsOfNumber + (number % 10);
        return modifiedNumber == 0 ? sumOfDigitsOfNumber : getSumOfDigitsOfNumber(modifiedNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //System.out.println(getSumOfDigitsOfNumber(number));

        int modifiedNumber = number;
        while (modifiedNumber != 0) {
            modifiedNumber = modifiedNumber / 10;
            sumOfDigitsOfNumber = sumOfDigitsOfNumber + (number % 10);
            number = modifiedNumber;
        }
        System.out.println(sumOfDigitsOfNumber);
    }
}
