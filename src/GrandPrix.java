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

    private Team[] getTeams() {
        return this.teams;
    }

}
