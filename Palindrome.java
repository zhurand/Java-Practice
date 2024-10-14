//А роза упала на лапу Азора
//
//И снова напишем программу, которая определяет, палиндромом перед нами или нет.
//
//Формат ввода
//Вводится строка.
//
//Формат вывода
//Если введённая строка относится к палиндрому, то вывести YES, а иначе — NO.
//
//Примечание
//При проверке не обращайте внимания на регистр и пробелы.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().toLowerCase();

        String lineWithoutSpaces = line.replaceAll("\\s+","");

        String reverseLine = "";

        for (int i = 0; i < lineWithoutSpaces.length(); i++) {
            reverseLine = lineWithoutSpaces.charAt(i) + reverseLine;
        }

        if (reverseLine.equals(lineWithoutSpaces)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
