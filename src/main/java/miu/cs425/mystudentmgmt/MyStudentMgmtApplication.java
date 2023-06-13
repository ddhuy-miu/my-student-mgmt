package miu.cs425.mystudentmgmt;

import miu.cs425.mystudentmgmt.models.Classroom;
import miu.cs425.mystudentmgmt.models.Course;
import miu.cs425.mystudentmgmt.models.Student;
import miu.cs425.mystudentmgmt.models.Transcript;
import miu.cs425.mystudentmgmt.services.ClassroomService;
import miu.cs425.mystudentmgmt.services.CourseService;
import miu.cs425.mystudentmgmt.services.StudentService;
import miu.cs425.mystudentmgmt.services.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    @Autowired
    private TranscriptService transcriptService;

    @Autowired
    private ClassroomService classroomService;

    @Autowired
    private CourseService courseService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World of SpringBoot");
        System.out.println("Starting MyStudentMgmtApplication");

        System.out.println("==================");
        System.out.println("Insert new Student");
        Student student = new Student();
        student.setStudentId(1L);
        student.setStudentNumber("000-61-0001");
        student.setFirstName("Anna");
        student.setMiddleName("Lynn");
        student.setLastName("Smith");
        student.setCgpa(3.45);
        student.setDateOfEnrollment(new Date("2019/5/4"));

        student = studentService.insertStudent(student);
        System.out.println(student);

        System.out.println("==================");
        System.out.println("Insert new Student");
        Student student2 = new Student();
        student2.setStudentId(2L);
        student2.setStudentNumber("000-61-0002");
        student2.setFirstName("Huy");
        student2.setMiddleName("Dinh");
        student2.setLastName("Dang");
        student2.setCgpa(3.5);
        student2.setDateOfEnrollment(new Date("2023/2/1"));

        student2 = studentService.insertStudent(student2);
        System.out.println(student2);

        System.out.println("============================");
        System.out.println("Update Transcript to Student");
        student.setTranscript(new Transcript(1L, "BS Computer Science", student));
        student = studentService.updateStudent(student);
        System.out.println(student);

        System.out.println("============================");
        System.out.println("Update Transcript to Student");
        student2.setTranscript(new Transcript(2L, "MS Computer Science", student2));
        student2 = studentService.updateStudent(student2);
        System.out.println(student2);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);

        System.out.println("================");
        System.out.println("Create Classroom");
        Classroom classroom = new Classroom(1L, "McLaughlin building", "M105", students);
        classroom = classroomService.insertClassroom(classroom);
        System.out.println(classroom);


        System.out.println("================");
        System.out.println("Create new Course");
        Course course = new Course(1L, "CS401", "Modern Prog Practices", students);
        course = courseService.insertCourse(course);
        System.out.println(course);
    }
}
