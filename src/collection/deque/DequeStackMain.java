package collection.deque;

import java.util.ArrayDeque;

public class DequeStackMain {
    public static void main(String[] args) {
        ArrayDeque<Object> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("deque = " + deque);

        deque.offer(1);
        System.out.println("deque = " + deque);
    }
}
