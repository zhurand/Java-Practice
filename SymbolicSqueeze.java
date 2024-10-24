//Символическая выжимка
//
//Во многих промышленных задачах требуется понимать, из каких символов состоят данные. Напишите программу,
//чтобы по введённой строке она определяла, из каких символов та состоит.
//
//Формат ввода
//Вводится одна строка.
//
//Формат вывода
//Требуется вывести все символы этой строки без повторений.
//Порядок вывода не имеет значения.

import java.util.Scanner;
import java.util.HashSet;

public class SymbolicSqueeze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        HashSet<Character> lettersLine = new HashSet<>();

        for (char letter : line.toCharArray()) {
            lettersLine.add(letter);
        }

        for (char letter : lettersLine) {
            System.out.print(letter);
        }

    }
}
