import java.util.ArrayList;

public class StudentController {
    public ArrayList<Student> getStudentList(){
        ArrayList<Student>students= new ArrayList<>();
        Student student1= new Student();
        Student student2= new Student();
        student1.setStudentId(1);
        student1.setStudentName("-b");
        student1.setSection(":sec-B");

        student2.setStudentId(2);
        student2.setStudentName("-a");
        student2.setSection(":sec-A");
        students.add(student1);
        students.add(student2);
        return students;

    }



}
