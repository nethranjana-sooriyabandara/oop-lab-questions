package lab08;

public class StudentDisplayMain {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        System.out.println("---- Student Records ----");

        dao.displayAllStudents();
    }
}