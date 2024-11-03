//Чек
//
//Сдачу посчитать, конечно, все могут, но красивый чек напечатать — не так просто.
//
//Формат ввода:
//название товара;
//цена товара;
//вес товара;
//количество денег у пользователя.
//
//Формат вывода:
//Чек
//<название товара> - <вес>кг - <цена>руб/кг
//Итого: <итоговая стоимость>руб
//Внесено: <количество денег от пользователя>руб
//Сдача: <сдача>руб

import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Cheque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int price = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int money = Integer.parseInt(scanner.nextLine());
        int forPayment = weight * price;
        int change = money - forPayment;

        try {
            FileWriter cheque = new FileWriter("Cheque");
            cheque.write("Чек\n" +
                    name + " - " + weight + "кг" + " - " + price + "руб/кг\n" +
                    "Итого: " + forPayment + "руб\n" +
                    "Внесено: " + money + "руб\n" +
                    "Сдача: " + change + "руб");
            System.out.println("Чек напечатан.");
            cheque.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка печати чека.");
            e.printStackTrace();

        }
    }
}
