public interface Automobile {

    int  MAX_SPEED     = 200;   
    int  MAX_PASSENGERS = 5;

    void steer(String direction);
    void honk();
    int  getNumberOfDoors();
}