package Enum;

public enum Season {
    WINTER("winter", -16), SPRING("spring", 16),
    SUMMER("summer", 31), AUTUMN("autumn", 10);
    private String name;
    private int temperature;

    Season(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "The Season is: " + name + "And degree is: " + temperature;
    }
}