import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student=new Student("Jan", "Kowalski", "jank@wp.pl", "Elbląg,Długa 2", "123-456-789", new Date(1967,7,7));

        StudyProgram it=new StudyProgram("ZI","WZI",7,3);

        student.enrollStudent(it);

        student.addGrade(5,"PGO");
        student.addGrade(2,"ATER");

        List<Student>students=new ArrayList<>();
        students.add(student);

        Student.promoteAllStudents(students);
        Student.displayInfoAboutAllStudents(students);


    }
}