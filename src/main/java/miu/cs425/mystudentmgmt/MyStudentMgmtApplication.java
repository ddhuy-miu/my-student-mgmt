package miu.cs425.mystudentmgmt;

import miu.cs425.mystudentmgmt.models.Student;
import miu.cs425.mystudentmgmt.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World of SpringBoot");
        System.out.println("Starting MyStudentMgmtApplication");

        System.out.println("Insert new Student");
        Student student1 = new Student();
        student1.setStudentId(1L);
        student1.setStudentNumber(" 000-61-0001");
        student1.setFirstName("Anna");
        student1.setMiddleName("Lynn");
        student1.setLastName("Smith");
        student1.setCgpa(3.45);
        student1.setDateOfEnrollment(new Date("2019/5/4"));
        studentService.insertStudent(student1);
    }
}
