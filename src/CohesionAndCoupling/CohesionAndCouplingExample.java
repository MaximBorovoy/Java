package CohesionAndCoupling;

public class CohesionAndCouplingExample {
    public static void main(String[] args) {

    }
}

class A {
    private int i;

    public int getI() {
        return i;
    }
}

class B {
    void printI() {
        System.out.println(new A().getI());
    }
}

class LunchRoom {
    Cook cook;
    Waiter waiter;
    Cleaner cleaner;
}

class Cook {
    void cook() {

    }
}

class Waiter {
    void deliverFood() {

    }
}

class Cleaner {
    void cleanFloor() {

    }
}

