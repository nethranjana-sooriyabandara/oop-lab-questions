public class Student {

    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {

        if(mark >= 75) {
            return "A";
        }
        else if(mark >= 65) {
            return "B";
        }
        else if(mark >= 55) {
            return "C";
        }
        else if(mark >= 35) {
            return "S";
        }
        else {
            return "F";
        }
    }
}