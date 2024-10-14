// Сильная цифра
//
// Давайте попробуем выполнить ещё одно простое действие — найдём максимальную цифру числа.
//
// Формат ввода
// Вводится одно натуральное число.
//
// Формат вывода
// Требуется вывести одно натуральное число — максимальную цифру исходного.

import java.util.Scanner;

public class StrongInteger {
    public static void main(String[] args) {

        int maxInt = 0;

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        for (int i = 0; i < number.length(); i++) {
            char firstSymbol = number.charAt(i);
            int digit = Character.getNumericValue(firstSymbol);
            if(digit > maxInt) {
                maxInt = digit;
            }
        }

        System.out.println(maxInt);
    }
}