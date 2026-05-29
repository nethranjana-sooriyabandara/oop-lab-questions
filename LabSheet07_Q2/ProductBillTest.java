public class ProductBillTest {

    public static void main(String[] args) {

        ProductBill bill =
                new ProductBill("1500.00", "two");

        try {

            double total = bill.calculateTotal();
            System.out.println("Total = " + total);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Error: Both Price and the quantity must be valid numbers.");

        } finally {

            System.out.println(
                    "Product bill calculation completed.");
        }

        System.out.println("Program continues...");
    }
}
