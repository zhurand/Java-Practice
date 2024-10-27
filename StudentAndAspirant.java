//Студент и аспирант.
//
//Реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
//
//Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark,
//содержащую среднюю оценку.
//
//Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//Если средняя оценка студента равна 5, то сумма 2000 руб, иначе 1900.
//Переопределить этот метод в классе Aspirant.
//Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
//Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//Вызвать метод getScholarship() для каждого элемента массива.

public class StudentAndAspirant {
    public static void main(String[] args) {

        Student student = new Student("Журавлев", "Андрей", "Тестировщики",
                4.75);
        Aspirant aspirant = new Aspirant("Иванов", "Иван", "Математики",
                5.0, "Методы решения квадратных уравнений");

        Student[] students = {student, aspirant};
        for (Student learner : students) {
            System.out.println("Фамилия: " + learner.getFirstName() + " / Стипендия: " + learner.getScholarship());
        }

    }
}

class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return this.averageMark == 5 ? 2000 : 1900;
    }

}

class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return this.getAverageMark() == 5 ? 2500 : 2200;
    }
}
