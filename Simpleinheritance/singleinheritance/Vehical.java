package singleinheritance;

public class Vehical {
    // Property
    protected int speed;

    public Vehical(int speed) {
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Speed: " + speed + " km/h");
    }

}
