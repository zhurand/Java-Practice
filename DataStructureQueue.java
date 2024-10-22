//Очередь
//
//В программировании существует потребность не только в изученных нами коллекциях.
//Одна из таких очередь. Она реализует подход к хранению данных по принципу «Первый вошёл – первый ушел».
//
//Реализуйте класс Queue, который не имеет параметров инициализации, но поддерживает методы:
//
//push(item) — добавить элемент в конец очереди;
//pop() — «вытащить» первый элемент из очереди;
//isEmpty() — проверят очередь на пустоту.
//
//Примечание
//Ваше решение должно содержать только классы и функции.
//В решении не должно быть вызовов инициализации требуемых классов.

import java.util.ArrayList;

public class DataStructureQueue {
    public static void main(String[] args) {

        Queue queue = new Queue();
        int item = 0;
        while (item < 10) {
            queue.push(item);
            System.out.print(item + " ");
            item += 1;
        }
        System.out.println();
        while (!queue.isEmpty()) {
            System.out.print(queue.pop() + " ");
        }
    }
}

class Queue {

    private final ArrayList<Integer> queue = new ArrayList<>();

    public void push(int item) {
        this.queue.add(item);
    }

    public int pop() {
        int firstItem = this.queue.getFirst();
        this.queue.remove(this.queue.getFirst());
        return firstItem;
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

}