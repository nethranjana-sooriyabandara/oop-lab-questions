public class Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();

        Lecturer lecturer1 = new Lecturer("Nethranjana", "L001", "IT", 3, 50000);
        Lecturer lecturer2 = new Lecturer("Kasun", "L002", "Physics", 2, 45000);
        LabAssistant labAssistant1 = new LabAssistant("Saman", "A001", "Computer Lab", 100, 500);

        lecturer2.changeDepartment("Mathematics");

        System.out.println();
        lecturer1.displayLecturerDetails();
        double payment1 = lecturer1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + payment1);

        System.out.println();
        lecturer2.displayLecturerDetails();
        double payment2 = lecturer2.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + payment2);

        System.out.println();
        labAssistant1.displayLabAssistantDetails();
        double payment3 = labAssistant1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + payment3);

        double totalMonthlyPayment = payment1 + payment2 + payment3;

        System.out.println();
        System.out.println("Total Monthly Payment: " + totalMonthlyPayment);
        System.out.println("Total number of created staff objects: " + StaffMember.getStaffCount());

        System.out.println();
        lecturer1.showCommonNotice();
        lecturer2.showCommonNotice();
        labAssistant1.showCommonNotice();
    }
}