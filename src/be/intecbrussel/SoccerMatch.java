package be.intecbrussel;

public class SoccerMatch {


    //BONUS++
    // Implementeer een class SoccerMatch om voetbalwedstrijden bij te houden.
    // Voeg eigenschappen toe zoals de teams die spelen, de eindstand, enzovoort.


    private String teamsWhoPlayed;

    private int score;

    private SoccerTeam team;


    //constructors


    public SoccerMatch() {

    }

    public SoccerMatch(String teamsWhoPlayed, int score, SoccerTeam team) {
        this.score = score;
        this.teamsWhoPlayed = teamsWhoPlayed;
        this.team = team;

    }


    //getters and setters


    public String getTeamsWhoPlayed() {
        return teamsWhoPlayed;
    }

    public void setTeamsWhoPlayed(String teamsWhoPlayed) {
        this.teamsWhoPlayed = teamsWhoPlayed;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public SoccerTeam getTeam() {
        return team;
    }

    public void setTeam(SoccerTeam team) {
        this.team = team;
    }


    @Override
    public String toString() {
        return "SoccerMatch{" +
                "teamsWhoPlayed='" + teamsWhoPlayed + '\'' +
                ", score=" + score +
                ", team=" + team +
                '}';
    }
}
