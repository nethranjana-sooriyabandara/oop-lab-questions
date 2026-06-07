package lab08;

public class StudentInsertMain {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.addStudent(new Student(1, "Nimal Perera", 82));
    }
}