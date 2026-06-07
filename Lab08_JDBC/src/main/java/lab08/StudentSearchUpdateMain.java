package lab08;

public class StudentSearchUpdateMain {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        System.out.println("Before Update:");
        dao.findStudentById(1);

        dao.updateStudentMark(1, 95);

        System.out.println("After Update:");
        dao.findStudentById(1);
    }
}
