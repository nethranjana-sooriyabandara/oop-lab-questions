public class StudentMarkReport {

    private String[] marks;

    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    public int getMarkAt(int index) {

        String selectedMark = marks[index];

        return Integer.parseInt(selectedMark);
    }
}
