public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus(String brand, int year, String color, int passengerCapacity) {
        super(brand, year, color);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() { return passengerCapacity; }

    @Override
    public void accelerate() {
        System.out.println("Bus " + getBrand() + " accelerates slowly due to its size.");
    }

    @Override
    public void stop() {
        System.out.println("Bus " + getBrand() + " applies air brakes to stop.");
    }

    @Override
    public void gas() {
        System.out.println("Bus " + getBrand() + " uses diesel fuel.");
    }
}