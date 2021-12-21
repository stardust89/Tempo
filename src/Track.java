public class Track {
    String name;
    String city;
    String country;
    int capacity; //Fans
    double lengthInKilometers; //Per lap
    int turns;
    int laps;
    boolean hasVariants;

    public Track(String name, String city, String country, int capacity, double lengthInKilometers, int turns, int laps) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.capacity = capacity;
        this.lengthInKilometers = lengthInKilometers;
        this.turns = turns;
        this.laps = laps;
        this.hasVariants = false;
    }


}
