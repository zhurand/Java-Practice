//Стек
//
//Ещё одной полезной коллекцией является стек реализующий принцип «Последний пришёл – первый ушёл».
//Его часто представляют как стопку карт или магазин пистолета,
//где приходящие элементы закрывают выход уже находящимся в коллекции.
//
//Реализуйте класс Stack, который не имеет параметров инициализации, но поддерживает методы:
//
//push(item) — добавить элемент в конец стека;
//pop() — «вытащить» первый элемент из стека;
//isEmpty() — проверяет стек на пустоту.
//
//Примечание
//Ваше решение должно содержать только классы и функции.
//В решении не должно быть вызовов инициализации требуемых классов.

import java.util.ArrayList;
import java.util.List;

public class DataStructureStack {
    public static void main(String[] args) {

        Stack stack = new Stack();
        int item = 0;
        while (item < 10) {
            stack.push(item);
            System.out.print(item + " ");
            item += 1;
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}

class Stack {

    private final List<Integer> stack = new ArrayList<>();

    public void push(int item) {
        this.stack.add(item);
    }

    public int pop() {
        int index = this.stack.size();
        int firstItem = this.stack.get(index - 1);
        stack.remove(index - 1);
        return firstItem;
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

}
