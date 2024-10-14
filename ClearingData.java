//Очистка данных
//
//Местный провайдер собирает большое количество логов, однако зачастую файлы с отчётами приходят в негодность.
//Самые частые проблемы — ошибки вида ## и @@@.
//Напишите программу, которая избавляется от:
//Двух символов # в начале информационных сообщений;
//Строк, заканчивающихся тремя символами @.
//
//Формат ввода
//Вводятся строки отчёта. Признаком завершения ввода считается пустая строка.
//
//Формат вывода
//Очищенные данные.

import java.util.Scanner;
import java.util.ArrayList;

public class ClearingData {
    public static void main(String[] args) {

        ArrayList<String> arrayData = new ArrayList<>();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            String strData = scanner.nextLine();

            if (strData.isEmpty()) {
                break;
            }
            else if (strData.indexOf("##") == 0 & strData.lastIndexOf("@@@") == strData.length() - 3) {
                continue;
            }
            else if (strData.lastIndexOf("@@@") == strData.length() - 3) {
                continue;
            }
            else if (strData.indexOf("##") == 0) {
                arrayData.add(strData.replace("##", ""));
            }
            else {
                arrayData.add(strData);
            }
        }

        for (String oneString : arrayData) {
            System.out.println(oneString);
        }
        }

    }