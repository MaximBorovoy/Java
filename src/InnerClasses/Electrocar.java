package InnerClasses;

public class Electrocar {
    private int id;

    private class Motor {
        private void startMotor() {
            System.out.println("Motor is starting");
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }
}
