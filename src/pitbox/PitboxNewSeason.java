package pitbox;

import elements.Team;

import java.util.Arrays;

public class PitboxNewSeason {
    private Team[] pitboxPosition = new Team[10];

    public PitboxNewSeason(Team[] teams) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Old pitbox position: " + teams[i].getTeamPosition());
        }

        Team[] tempTeams = teams.clone();

        for (int i = 0; i <= teams.length-1; i++) {
            for (int j = 0; j <= teams.length-1; i++) {

                //TODO Problem bei der Schleife, Array out of bounds!
                if (teams[i].getTeamPoints() > teams[j].getTeamPoints()) {
                    tempTeams[i] = teams[i];
                    teams[i] = teams[j];
                    teams[j] = tempTeams[i];
                }
            }
        }

        this.pitboxPosition = Arrays.copyOf(teams, 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("New pitbox position: " + this.pitboxPosition[i].getTeamPosition());
        }
    }
}
