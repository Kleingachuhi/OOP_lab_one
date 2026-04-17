public class SportsCar extends Vehicle implements Automobile {

    private int numberOfDoors;
    private int turboBoost;  

    public SportsCar(String brand, int year, String color, int numberOfDoors, int turboBoost) {
        super(brand, year, color);
        this.numberOfDoors = numberOfDoors;
        this.turboBoost    = turboBoost;
    }

    @Override
    public void accelerate() {
        System.out.println("SportsCar " + getBrand() + " rockets forward at high speed!");
    }

    public void accelerate(int speedLevel) {
        System.out.println("SportsCar " + getBrand() + " accelerates to speed level " + speedLevel + " with turbo boost of " + turboBoost + "!");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar " + getBrand() + " uses carbon-ceramic brakes to stop instantly.");
    }

    @Override
    public void gas() {
        System.out.println("SportsCar " + getBrand() + " uses premium 98 octane fuel.");
    }

    @Override
    public void steer(String direction) {
        System.out.println("SportsCar steers sharply to the " + direction + ".");
    }

    @Override
    public void honk() {
        System.out.println("SportsCar goes: HOOOONK!");
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}