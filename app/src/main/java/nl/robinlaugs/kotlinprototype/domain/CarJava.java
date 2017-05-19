package nl.robinlaugs.kotlinprototype.domain;

public class CarJava {

    private final String brand;
    private final String type;
    private final int year;

    public CarJava(String brand, String type, int year) {
        this.brand = brand;
        this.type = type;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

}
