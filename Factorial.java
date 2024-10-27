//Вводится натуральное число. Вычислить его факториал.

import java.util.Scanner;

public class Factorial {

    public static int factorial(int number) {
        int fact = 1;
        while (number > 1) {
            fact *= number;
            number --;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(factorial(Integer.parseInt(scanner.nextLine())));

    }
}
