public class Main {
    public static void main(String[] args) {
        Football real = new Football(35, "real");
        Football barcelona = new Football(36, "barcelona");
        Baseball oslo = new Baseball(15, "oslo");
        League<Football> league = new League<>();
        league.addTeam(real);
        league.addTeam(barcelona);
        league.print();
    }
}
