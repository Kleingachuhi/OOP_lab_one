public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, int year, String color) {
        super(brand, year, color);   
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle " + getBrand() + " accelerates by twisting the throttle.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + getBrand() + " stops using hand and foot brakes.");
    }

    @Override
    public void gas() {
        System.out.println("Motorcycle " + getBrand() + " uses regular unleaded fuel.");
    }
}