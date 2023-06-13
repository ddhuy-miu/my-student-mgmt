package miu.cs425.mystudentmgmt;

import miu.cs425.mystudentmgmt.models.Student;
import miu.cs425.mystudentmgmt.models.Transcript;
import miu.cs425.mystudentmgmt.services.StudentService;
import miu.cs425.mystudentmgmt.services.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    @Autowired
    private TranscriptService transcriptService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World of SpringBoot");
        System.out.println("Starting MyStudentMgmtApplication");

        System.out.println("Insert new Student");
        Student student = new Student();
        student.setStudentId(1L);
        student.setStudentNumber(" 000-61-0001");
        student.setFirstName("Anna");
        student.setMiddleName("Lynn");
        student.setLastName("Smith");
        student.setCgpa(3.45);
        student.setDateOfEnrollment(new Date("2019/5/4"));

        student = studentService.insertStudent(student);
        System.out.println(student);

        System.out.println("Update Transcript to Student");
        student.setTranscript( new Transcript(1L, "BS Computer Science"));
        student = studentService.updateStudent(student);
        System.out.println(student);
    }
}
