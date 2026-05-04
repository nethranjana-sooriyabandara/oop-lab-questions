package Question01;

public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base charge only: " + calculator.calculateCharge(1000.0));
        System.out.println("Base + distance: " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("Base + distance + weight: " + calculator.calculateCharge(1000.0, 5.0, 2.0));
        System.out.println("Base + express delivery: " + calculator.calculateCharge(1000.0, true));

        // Compile-time polymorphism:
        // Java selects the correct method depending on the parameters at the time of compile.
    }
}
