package be.intecbrussel;

public class SoccerField {


    public static void main(String[] args) {

        SoccerTeam barcelona = new SoccerTeam("barcelona", "barcelona", 11);
        SoccerTeam miami = new SoccerTeam("Miami BeachClub", "Miami", 11, "lost", "Beckham", "Miami Field");
        SoccerTeam united = new SoccerTeam();


        SoccerPlayer marwane = new SoccerPlayer("Marwane", 21, "LW", barcelona, "Marrokaan", 99, 99);
        SoccerPlayer messi = new SoccerPlayer("Messi", 35, "Attacker", miami, "Argentijn", 81, 92);
        SoccerPlayer deJong = new SoccerPlayer("DeJong", 23, "Midfielder", united, "hollander", 87, 82);


        SoccerMatch abc = new SoccerMatch("united", 5 - 0, barcelona);


        System.out.println(marwane.getAge());
        System.out.println(messi.getPosition());

        System.out.println(marwane.getNationaliteit());
        System.out.println(messi.getSpeed());
        System.out.println(barcelona.getNumPlayers());


    }
}
