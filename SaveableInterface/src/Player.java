import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveble{
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> values) {
        this.name = values.get(0);
        this.health = Integer.parseInt(values.get(1));
        this.weapon = values.get(2);
    }
}
