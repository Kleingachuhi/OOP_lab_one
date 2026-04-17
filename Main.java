public class Main {

    public static void main(String[] args) {

        System.out.println("===== Creating a Sedan instance =====");
        Sedan mySEdan = new Sedan("Toyota", 2022, "Silver", 4);
        System.out.println("Car: " + mySEdan);

        System.out.println("\n--- Method OVERRIDING (Sedan overrides Vehicle.accelerate) ---");
        mySEdan.accelerate();   
        mySEdan.stop();
        mySEdan.gas();
        mySEdan.steer("left");
        mySEdan.honk();
        System.out.println("Doors: " + mySEdan.getNumberOfDoors());

        System.out.println("\n--- Method OVERLOADING (SportsCar has two accelerate() methods) ---");
        SportsCar mySportsCar = new SportsCar("Ferrari", 2023, "Red", 2, 500);

        mySportsCar.accelerate();       
        mySportsCar.accelerate(9);      
        System.out.println("\n--- Polymorphism demo ---");
        Vehicle v = new Sedan("Honda", 2020, "Blue", 4);
        v.accelerate();  
        Vehicle v2 = new Motorcycle("Yamaha", 2021, "Black");
        v2.accelerate();  
    }
}