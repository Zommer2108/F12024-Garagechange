package elements;

public class Driver {
    private String forname;
    private String surname;
    private int age;
    private Team team;

    public Driver(String forname, String surname, int age, Team team) {
        this.forname = forname;
        this.surname = surname;
        this.age = age;
        this.team = team;
    }

    public Driver(String forname, String surname, int age) {
        this.forname = forname;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getForname() {
        return this.forname;
    }

    public String getSurname() {
        return this.surname;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString(){
        return ("That driver's name is" + this.forname + this.surname + " he is" + this.age + " old and drives for \n" + this.team + ".");
    }
}
