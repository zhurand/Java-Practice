//Точная степень двойки
//
//Дано натуральное число N.
//Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//
//Операцией возведения в степень пользоваться нельзя!
//
//Точные степени двойки всегда неотрицательные числа.
//Ряд степеней двойки: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536...
//
//https://ejudge.179.ru/tasks/training/recursion.html

import java.util.Scanner;

public class ExactPowerOfTwo {

    public static String isExactPowerOfTwo(int n) {

        if (n <= 0) {
            return "NO";
        }
        if (n == 1) {
            return "YES";
        }
        if (n % 2 == 0) {
            return isExactPowerOfTwo(n / 2);
        }
        else {
            return "NO";
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //System.out.println(isExactPowerOfTwo(n));

        while (true) {
            if (n <= 0) {
                System.out.println("NO");
                break;
            }
            if (n == 1) {
                System.out.println("YES");
                break;
            }
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                System.out.println("NO");
                break;
            }

        }

    }
}
