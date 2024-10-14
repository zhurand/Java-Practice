//Территория зла
//
//В давние времена считалось, что если какая-то местность является треугольником, то в ней заключено страшное зло.
//
//При этом люди оценивали риск встретить зло по форме этого треугольника:
//
//в остроугольном треугольнике вероятность встретить зло крайне мала;
//в тупоугольном — велика;
//в прямоугольном — 100%.
//
//Напишите программу, которая по длине сторон треугольной местности, определяет вероятность встретить зло.
//
//Формат ввода
//Три числа — длины сторон треугольной местности.
//
//Формат вывода
//Вероятность встретить зло согласно поверью:
//
//крайне мала;
//велика;
//100%.
//
//Для определения типа треугольника понадобится сумма квадратов
//меньших сторон (b**2 + c**2) и квадрат большей стороны.
//Если а**2 = (b**2 + c**2), то треугольник прямоугольный.
//Если а**2 > (b**2 + c**2), то треугольник тупоугольный.
//Если а**2 < (b**2 + c**2), то треугольник остроугольный.

import java.util.Arrays;
import java.util.Scanner;

public class EvilTerritory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = (int) Math.pow(scanner.nextInt(), 2);
        int b = (int) Math.pow(scanner.nextInt(), 2);
        int c = (int) Math.pow(scanner.nextInt(), 2);

        int longestSide = 0;

        if ((a > b) && (a > c)) {
            longestSide = a;
        }
        else if ((b > a) && (b > c)) {
            longestSide = b;
        }
        else if ((c > a) && (c > b)) {
            longestSide = c;
        }

        /* Использование массива вместо if else

        int[] sides = {a, b, c};

        int longestSide = Arrays.stream(sides).max().getAsInt();

        */

        int sumTwoSmallerSides = (a + b + c) - longestSide;

        if (longestSide == sumTwoSmallerSides) {
            System.out.println("100%");
        }
        else if (longestSide > sumTwoSmallerSides) {
            System.out.println("велика");
        }
        else {
            System.out.println("крайне мала");
        }
    }
}