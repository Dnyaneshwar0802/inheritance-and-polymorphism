package singleinheritance;

public class Car extends Vehical {
    private String brand;
    private String model;

    public Car(int speed, String brand, String model) {
        super(speed);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

}
