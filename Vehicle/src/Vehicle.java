public class Vehicle {
    private int speed;
    private String transmission;

    public Vehicle(int speed, String transmission) {
        this.speed = speed;
        this.transmission = transmission;
    }

    public void move(){
        System.out.println("Vehicle is moving with speed " + this.speed);
    }
}
