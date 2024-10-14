//Меню питания
//
//В детском саду ежедневно подают новую кашу на завтрак.
//Каши чередуются в следующем порядке:
//
//Манная;
//Гречневая;
//Пшённая;
//Овсяная;
//Рисовая.
//Напишите программу, которая строит расписание каш на ближайшие дни.
//
//Формат ввода
//Вводится натуральное число N — количество дней.
//
//Формат вывода
//Вывести список каш в порядке подачи.

import java.util.Scanner;
import java.util.Arrays;

public class PorridgeMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] porridges = {"Манная", "Гречневая", "Пшённая", "Овсяная", "Рисовая"};

        int days = scanner.nextInt();

        int porrigdeIndex = 0;

        int dayCounter = 1;

        if (days > porridges.length) {
            while (dayCounter <= days) {
                System.out.println(porridges[porrigdeIndex]);
                if (porrigdeIndex == 4) {
                    porrigdeIndex = 0;
                    dayCounter++;
                    continue;
                }
                porrigdeIndex++;
                dayCounter++;
                }
            }
        else {
            while (days > 0) {
                System.out.println(porridges[porrigdeIndex]);
                porrigdeIndex++;
                days--;
            }
        }
    }
}
