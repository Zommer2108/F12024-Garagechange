package elements;

public class Team {
    private String teamName;
    private int foundingYear;
    private int foundingMonth;
    private int foundingDay;
    private TeamPrinciple teamPrinciple;
    private double teamPoints;
    private int teamPosition;
    private Driver[] drivers = new Driver[2];

    public Team(String teamName, int foundingYear, int foundingMonth, int foundingDay, TeamPrinciple teamPrinciple,
                Driver driver1, Driver driver2) {
        this.teamName = teamName;
        this.foundingYear = foundingYear;
        this.foundingMonth = foundingMonth;
        this.foundingDay = foundingDay;
        this.teamPrinciple = teamPrinciple;
        this.drivers[0] = driver1;
        this.drivers[1] = driver2;
    }

    public String getFoundingDateTeam() {
        return this.foundingYear + "/" + this.foundingMonth + "/" + this.foundingDay;
    }

    public String getFoundingSpecific(String searchTerm) {
        String result;
        switch (searchTerm) {
            case ("year"):
                return result = String.valueOf(this.foundingYear);
            case ("month"):
                return result = String.valueOf(this.foundingMonth);
            case ("day"):
                return result = String.valueOf(this.foundingDay);
            default:
                return result = "Invalid Search Term";

        }
    }

    public String getTeamName() {
        return this.teamName;
    }

    public TeamPrinciple getTeamPrinciple() {
        return this.teamPrinciple;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getBothDrivers() {
        return this.drivers[0].getForname() + " " + this.drivers[0].getSurname() + " and "
            + this.drivers[1].getForname() + " " + this.drivers[1].getSurname();
    }

    public String getSpecificDriver(int driverNumber) {
        int number = driverNumber;
        number--;
        return this.drivers[number].getForname() + " " + this.drivers[number].getSurname();
    }

    public double getTeamPoints() {
        return teamPoints;
    }

    public void setTeamPosition(int teamPosition) {
        this.teamPosition = teamPosition;
    }

    public int getTeamPosition() {
        return this.teamPosition;
    }

    public void setTeamPoints(double teamPoints) {
        this.teamPoints = teamPoints;
    }
}
