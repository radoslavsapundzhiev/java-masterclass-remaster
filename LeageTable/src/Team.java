public abstract class Team implements Comparable<Team>{
    private int score;
    private String name;
    public Team(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Team team) {
        if(this.score > team.score) {
            return -1;
        } else if (this.score < team.score) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
