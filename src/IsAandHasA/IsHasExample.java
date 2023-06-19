package IsAandHasA;

public class IsHasExample {
    public static void main(String[] args) {

    }
}

class Vehicle {
    int wheels = 4;
}

class Telega {
    int wheels = 4;
}

//MyCar is not a Telega, but MyCar is a Vehicle
class MyCar extends Vehicle {
    //has a
    Radio radio = new Radio();

    void listen() {
        radio.listen();
    }

    void drive() {

    }
}

class Radio {
    void listen() {
        System.out.println("listen to the radio");
    }
}
