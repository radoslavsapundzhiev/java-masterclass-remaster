public class Bmv extends Car{
    private int year;

    public Bmv(int speed, String transmission, String color, int year) {
        super(speed, transmission, color);
        this.year = year;
    }

    @Override
    public void steering() {
        System.out.println("Bmv is moving at hand steering");
        super.steering();
    }
}
