//Работа не волк
//
//Рассмотрим объект «Программист», который задаётся именем, должностью и количеством отработанных часов.
//Каждая должность имеет собственный оклад (заработную плату за час работы).
//В нашей импровизированной компании существуют 3 должности:
//
//Junior — с окладом 10 тугриков в час;
//Middle — с окладом 15 тугриков в час;
//Senior — с окладом 20 тугриков в час по умолчанию и +1 тугрик за каждое новое повышение.
//
//Напишите класс Programmer, который инициализируется именем и должностью (отработка у нового работника равна нулю).
//Класс реализует следующие методы:
//
//work(time) — отмечает новую отработку в количестве часов time;
//rise() — повышает программиста;
//info() — возвращает строку для бухгалтерии в формате:
//<имя> <количество отработанных часов>ч. <накопленная зарплата>тгр.
//
//Примечание
//Ваше решение должно содержать только классы и функции.
//В решении не должно быть вызовов инициализации требуемых классов.

public class WorkIsNotWolf {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Васильев Иван", "Junior");
        programmer.work(750);
        System.out.println(programmer.info());
        programmer.rise();
        programmer.work(500);
        System.out.println(programmer.info());
        programmer.rise();
        programmer.work(250);
        System.out.println(programmer.info());
        programmer.rise();
        programmer.work(250);
        System.out.println(programmer.info());
    }
}

class Programmer {
    private String name;
    private String grade;
    private int timeWorked;
    private int wage;
    private int salary;

    public Programmer(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.timeWorked = 0;
        this.wage = 0;
        switch (grade) {
            case "Junior" -> this.salary = 10;
            case "Middle" -> this.salary = 15;
            case "Senior" -> this.salary = 20;
        }
    }

    public void work(int time) {
        this.timeWorked = this.timeWorked + time;
        this.wage = this.wage + (time * this.salary);
    }

    public void rise() {
        switch (this.grade) {
            case "Junior" -> {
                this.grade = "Middle";
                this.salary = 15;
            }
            case "Middle" -> {
                this.grade = "Senior";
                this.salary = 20;
            }
            case "Senior" -> this.salary += 1;
        }
    }

    public String info() {
        return this.name + " " + this.timeWorked + "ч. " + this.wage + "тгр.";
    }
}
