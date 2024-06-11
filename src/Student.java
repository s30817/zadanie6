
import java.util.Date;
import java.util.List;

    public class Student {

        public static int nextStudentNumber = 1;
        public String imie;
        public String nazwisko;
        public String email;
        public String adres;
        public String numer;
        public Date dateOfBirth;
        public int studentNumber;
        public StudyProgram studyProgram;
        public int obecnySemestr;
        public int liczbaITNs;
        private String status;

        public Student(String imie, String nazwisko, String email, String adres, String numer, Date dateOfBirth) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.email = email;
            this.adres = adres;
            this.numer = numer;
            this.dateOfBirth = dateOfBirth;
        }

        public void enrollStudent(StudyProgram studyProgram) {
            this.studyProgram = studyProgram;
            this.obecnySemestr = 1;

        }

        public void addGrade(int grade, String kurs) {
            liczbaITNs++;
        }

        public void promote() {
            if (obecnySemestr < studyProgram.getCzasTrwania()) {
                if (liczbaITNs <= studyProgram.getMaxITNs()) {
                    obecnySemestr++;
                } else {
                    System.out.println("Student has exceeded the maximum number of grades allowed.");
                }
            } else {
                status = (status.equals("Graduate") ? status : "Graduate");
            }
        }

        public String getStatus() {
            return status;
        }

        public static void promoteAllStudents(List<Student> students) {
            for (Student student : students) {
                student.promote();
            }
        }

        public static void displayInfoAboutAllStudents(List<Student> students) {
            for (Student student : students) {
                System.out.println("Student number: " + student.studentNumber);
                System.out.println("Name: " + student.imie + " " + student.nazwisko);
                System.out.println("Email: " + student.email);
                System.out.println("Address: " + student.adres);
                System.out.println("Numer: " + student.numer);
                System.out.println("Date of Birth: " + student.dateOfBirth);
                System.out.println("Programme: " + student.studyProgram.getOpis());
                System.out.println("Current Semester: " + student.obecnySemestr);
            }
        }
    }
