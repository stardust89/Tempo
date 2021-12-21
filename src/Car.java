public class Car {
    String carID;
    Team team;
    Driver driver;
    int reliability;

    public Car(String carID, Team team, Driver driver, int reliability) {
        this.carID = carID;
        this.team = team;
        this.driver = driver;
        this.reliability = reliability;
    }
}
