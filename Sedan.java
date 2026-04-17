public class Sedan extends Vehicle implements Automobile {

    private int numberOfDoors;

    public Sedan(String brand, int year, String color, int numberOfDoors) {
        super(brand, year, color);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accelerate() {
        System.out.println("Sedan " + getBrand() + " accelerates smoothly at normal speed.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + getBrand() + " stops using disc brakes.");
    }

    @Override
    public void gas() {
        System.out.println("Sedan " + getBrand() + " uses 91 octane fuel.");
    }

    @Override
    public void steer(String direction) {
        System.out.println("Sedan steers to the " + direction + ".");
    }

    @Override
    public void honk() {
        System.out.println("Sedan goes: Beep beep!");
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}