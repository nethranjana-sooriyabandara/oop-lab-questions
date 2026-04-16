abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;

    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public static void showSystemName() {
        System.out.println("System Name: Campus Staff Payment System");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isEmpty()) {
            department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: All staff members must follow university rules and regulations.");
    }

    public abstract double calculateMonthlyPayment();


// StaffMember is abstract as it represents a general concept and not tobe be directly instantiated.
}
