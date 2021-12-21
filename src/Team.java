public class Team {
    String name;
    String homeBase;
    Driver[] drivers;
    Car[] cars;
    int resources;
    int technicalExpertise;

    public Team(String name, String homeBase, Driver[] drivers, int resources, int technicalExpertise, Car[] cars){
        this.name = name;
        this.homeBase = homeBase;
        this.drivers = drivers;
        this.resources = resources;
        this.technicalExpertise = technicalExpertise;
        this.cars = cars;
    }


}
