package be.intecbrussel;

public class SoccerTeam {


    private String name;
    private String homeCity;

    private int numPlayers;


    private String match;

    private String player;
    private String field;

//constructors


    //no-args constructors
    public SoccerTeam() {

    }


    public SoccerTeam(String name, String homeCity, int numPlayers, SoccerMatch match, SoccerPlayer player, SoccerField field) {
        this.name = name;
        this.homeCity = homeCity;
        this.numPlayers = numPlayers;
        this.player = String.valueOf(player);
        this.field = field.toString();
        this.match = String.valueOf(match);

    }

    public SoccerTeam(String miamiBeachClub, String miami, int numPlayers, String lost, String beckham, String miamiField) {


    }

    public SoccerTeam(String team, String city, int numberOfPlayers) {

    }


//getters and setters

    public String getName() {
        return name;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public int getNumPlayers() {
        return numPlayers;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(SoccerMatch match) {
        this.match = String.valueOf(match);
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(SoccerPlayer player) {
        this.player = String.valueOf(player);
    }

    public String getField() {
        return field;
    }

    public void setField(SoccerField field) {
        this.field = field.toString();
    }









    @Override
    public String toString() {
        return "SoccerTeam{" +
                "name='" + name + '\'' +
                ", homeCity='" + homeCity + '\'' +
                ", numPlayers=" + numPlayers +
                ", match=" + match +
                ", player=" + player +
                ", field=" + field +
                '}';
    }
}
