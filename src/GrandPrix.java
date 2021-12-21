import java.util.ArrayList;

public class GrandPrix {
    String name;
    String country;
    Track track;
    Team[] teams;

    public GrandPrix(String name, String country, Track track, Team[] teams) {
        this.name = name;
        this.country = country;
        this.track = track;
        this.teams = teams;
    }

    private Team[] selectTeams(Team team1, Team team2, Team team3, Team team4, Team team5, Team team6, Team team7, Team team8) {
        return new Team[]{team1,team2,team3,team4,team5,team6,team7,team8};
    }

    public Team[] getTeams() {
        return this.teams;
    }

    public void runQ1() {
        // Build list of participating cars

        ArrayList listOfCars = new ArrayList<>();
        for ( Team team : teams) {
            for (Car car : team.cars) {
                listOfCars.add(car);
            }
        }
        Object[] cars = listOfCars.toArray(new Car[0]);

        //  Get average lap time in seconds
        double averageLapTimeInSeconds = track.lengthInKilometers / ((double)track.averageSpeed / 3600);
        //TODO: Find a way to generate lap times for each car, taking into account driver skill
        //TODO: Remove some of car reliability while at it
    }

}
