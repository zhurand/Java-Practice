//Четное-нечетное.
//
//Передать на вход программы число в качестве аргумента.
//Если оно нечетное, распечатать его.

import java.util.Scanner;

public class EvenOdd {

    public static String evenOdd(int number) {
        return number % 2 == 0 ? number + " - Четное число" : number + " - Нечетное число";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(evenOdd(Integer.parseInt(scanner.nextLine())));

    }
}
