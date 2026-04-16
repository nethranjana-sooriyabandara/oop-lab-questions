final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "SL University";
    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader() {
        System.out.println("=== University Policy ===");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }

    // Inheritance cannnot be done to final class as it ensures rules are not modified.
}