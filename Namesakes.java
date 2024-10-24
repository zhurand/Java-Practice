//Однофамильцы
//
//Начальник кадровой службы хочет выяснить, сколько мужчин-однофамильцев работает в организации. У него есть список фамилий, и на основании этого списка нужно вычислить количество фамилий, которые совпадают с другими.
//
//Формат ввода
//В первой строке указывается количество мужчин — сотрудников организации (N).
//Затем идут N строк с фамилиями этих сотрудников в произвольном порядке.
//
//Формат вывода
//Количество однофамильцев в организации.

import java.util.Scanner;
import java.util.HashMap;

public class Namesakes {
    public static void main(String[] args) {

        HashMap<String, Integer> namesMen = new HashMap<>();

        int namesakes = 0;

        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());

        while (men > 0) {
            String lastName = scanner.nextLine();
            if (namesMen.containsKey(lastName)) {
                namesMen.put(lastName, namesMen.get(lastName) + 1);
            }
            else {
                namesMen.put(lastName, 1);
            }
            men--;
        }

        for (int value : namesMen.values()) {
            if (value > 1) {
                namesakes = namesakes + value;
            }
        }

        System.out.print(namesakes);
    }
}
