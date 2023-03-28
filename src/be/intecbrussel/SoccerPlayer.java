package be.intecbrussel;

public class SoccerPlayer {


    //BONUS:


    private String name;

    private int age;

    private String position;

    private SoccerTeam team;

    private String nationaliteit;

    private int speed;

    private int shooting;


    //constructor
    public SoccerPlayer() {

    }


    public SoccerPlayer(String name, int age, String position, SoccerTeam team, String nationaliteit, int speed, int shooting) {

        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
        this.speed = speed;
        this.nationaliteit = nationaliteit;
        this.shooting = shooting;


    }


    //getters and setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public SoccerTeam getSoccerTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(SoccerTeam team) {
        this.team = team;
    }


    public String getNationaliteit() {
        return nationaliteit;
    }

    public int getSpeed() {
        return speed;
    }


    public void setNationaliteit(String nationaliteit) {
        this.nationaliteit = nationaliteit;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getShooting() {
        return shooting;
    }


    public void setShooting(int shooting) {
        this.shooting = shooting;
    }


    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", team=" + team +
                ", nationaliteit='" + nationaliteit + '\'' +
                ", speed=" + speed +
                ", shooting=" + shooting +
                '}';
    }
}
