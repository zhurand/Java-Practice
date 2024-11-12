/** Сохранение и загрузка объекта
 *
 * Описание:
 * Создайте класс Person с полями name и age. Реализуйте сериализацию и десериализацию объекта этого класса.
 *
 * Подсказка:
 * Используйте интерфейс Serializable.
 * Для сериализации используйте классы ObjectOutputStream и FileOutputStream.
 * Для десериализации используйте классы ObjectInputStream и FileInputStream.
 */

import java.io.*;
import java.util.ArrayList;

public class SavingAndLoading {
    public static void main(String[] args) {
/*
        Person person = new Person("Andrew", 33);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("Person.ser"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
            }
*/
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}