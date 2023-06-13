package miu.cs425.mystudentmgmt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStudentMgmtApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World of SpringBoot");
        System.out.println("Starting MyStudentMgmtApplication");
    }
}
