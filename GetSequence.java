//От A до B
//
//Даны два целых числа A и В (каждое в отдельной строке).
//Выведите все числа от A до B включительно, в порядке возрастания,
//если A < B, или в порядке убывания в противном случае.
//https://ejudge.179.ru/tasks/training/recursion.html

import java.util.Scanner;

public class GetSequence {

    public static String getSequence(int a, int b) {

        if (a == b) {
            return Integer.toString(a);
        }

        if (a > b) {
            return a + " " + getSequence(a - 1, b);
        }
        else {
            return a + " " + getSequence(a + 1, b);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        System.out.println(getSequence(a, b));

        /*  Решение циклом
        if (a > b) {
            while (a >= b) {
                System.out.print(a + " ");
                a--;
            }
        }
        else {
            while (a <= b) {
                System.out.print(a + " ");
                a++;
            }
        }
        */

    }

}