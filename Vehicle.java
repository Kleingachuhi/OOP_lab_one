public abstract class Vehicle {

    private String brand;
    private int year;
    private String color;

    public Vehicle(String brand, int year, String color) {
        this.brand = brand;
        this.year  = year;
        this.color = color;
    }

    public String getBrand() { return brand; }
    public int    getYear()  { return year;  }
    public String getColor() { return color; }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();

    @Override
    public String toString() {
        return year + " " + color + " " + brand;
    }
}