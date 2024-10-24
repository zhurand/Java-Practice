//Зайка
//
//Поможем детям подсчитать, сколько за окном поезда встречается животных и деревьев каждого вида.
//
//Формат ввода
//В каждой строке записано описание придорожной местности.
//Конец ввода обозначается пустой строкой.
//
//Формат вывода
//Список увиденного и их количество.
//Порядок вывода не имеет значения.
//
//Пример ввода
//березка елочка зайка волк березка
//сосна зайка сосна елочка зайка медведь
//сосна сосна сосна белочка сосна белочка

import java.util.Scanner;
import java.util.HashMap;

public class Bunny {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> objectsOutside = new HashMap<>();

        boolean flag = true;

        while (flag) {

            String outside = scanner.nextLine();

            if (outside.isEmpty()) {
                flag = false;
                break;
            }

            for (String object : outside.split(" ")) {
                if (!objectsOutside.containsKey(object)) {
                    objectsOutside.put(object, 1);
                }
                else {
                    objectsOutside.put(object, objectsOutside.get(object) + 1);
                }
            }
        }

        for (String key : objectsOutside.keySet()) {
            System.out.print(key + " ");
            System.out.println(objectsOutside.get(key));
        }

    }
}
