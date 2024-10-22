//Кашееды
//
//Каждый воспитанник детского сада любит либо манную, либо овсяную, либо обе каши.
//Давайте создадим программу, которая позволит воспитателю быстро выяснить, сколько детей любят обе каши.
//
//Формат ввода
//В первых двух строках указывается количество детей, любящих манную и овсяную каши (N и M).
//
//Затем идут N строк — фамилии детей, которые любят манную кашу, и
//M строк с фамилиями детей, любящих овсяную кашу.
//Гарантируется, что в группе нет однофамильцев.
//
//Формат вывода
//Количество учеников, которые любят обе каши.
//Если таких не окажется, в строке вывода нужно написать «Таких нет».

import java.util.Scanner;
import java.util.HashSet;

public class PorridgeLovers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<String> semolina = new HashSet<>();
        HashSet<String> oatmeal = new HashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String lastName = scanner.nextLine();
            semolina.add(lastName);
            n--;
        }

        while (m > 0) {
            String lastName = scanner.nextLine();
            oatmeal.add(lastName);
            m--;
        }

        semolina.retainAll(oatmeal);

        if (semolina.isEmpty()) {
            System.out.println("Таких нет");
        }
        else {
            System.out.println(semolina.size());
        }

    }
}
