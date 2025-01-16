

public class Dog extends Mammal{
    public Dog(boolean hasFur) {
        super(hasFur);
    }

    @Override
    public void sound() {
        System.out.println("Barks");
    }
}
