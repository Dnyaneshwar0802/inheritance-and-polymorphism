
public class MethodOverloadingTest {
    public static void main(String[] args) {
        System.out.println("This is Test class");
        MathOperations math = new MathOperations();

        int productOfTwo = math.multiply(4, 5);
        int productOfThree = math.multiply(2, 3, 4);

        System.out.println("Product of two numbers: " + productOfTwo);
        System.out.println("Product of three numbers: " + productOfThree);
    }
}
