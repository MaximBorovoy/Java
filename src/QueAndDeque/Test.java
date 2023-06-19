package QueAndDeque;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Door> doors = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            doors.add(new Door(i + 1));
        }
        Deque<Door> arrayDeque = new ArrayDeque<>(doors);
        Deque<Door> linkedList = new LinkedList<>(doors);
        System.out.println(arrayDeque);
        System.out.println("......");
        System.out.println(arrayDeque.pollLast());
    }

    static class Door {
        Integer id;

        public Door(Integer id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Door{" +
                    "id=" + id +
                    '}';
        }
    }

}
