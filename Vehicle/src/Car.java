public class Car extends Vehicle{
    private String color;
    public Car(int speed, String transmission, String color) {
        super(speed, transmission);
        this.color = color;
    }

    public void steering(){
        System.out.println("Car is moving at unknown steering");
    }

    @Override
    public void move() {
        System.out.println("Car with color " + this.color + " is moving");
        super.move();
    }
}
