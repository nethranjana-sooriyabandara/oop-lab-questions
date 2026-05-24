public class Member {

    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    public Member(String memberName, String membershipType,
                  boolean newsletterSelected, int numberOfMonths) {

        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isNewsletterSelected() {
        return newsletterSelected;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public double getMonthlyFee() {

        if (membershipType.equals("Premium")) {
            return 2500;
        } else {
            return 1000;
        }
    }

    public double getMembershipFee() {

        double monthlyFee = getMonthlyFee();
        double total = monthlyFee * numberOfMonths;

        if (newsletterSelected) {
            total = total + 200;
        }

        return total;
    }

    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }
}
