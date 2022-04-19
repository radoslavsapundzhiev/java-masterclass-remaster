import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private List<Team> teams;

    public League() {
        this.teams = new ArrayList<>();
    }

    public void print() {
        Collections.sort(teams);
        this.teams.forEach(System.out::println);
    }

    public void addTeam(T team) {
        this.teams.add(team);
    }
}
