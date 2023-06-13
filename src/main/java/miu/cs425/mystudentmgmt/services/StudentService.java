package miu.cs425.mystudentmgmt.services;

import miu.cs425.mystudentmgmt.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student insertStudent(Student student);

    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(Long studentId);

    public Student updateStudent(Student student);

    public void deleteStudent(Long studentId);

    public void deleteStudent(Student student);
}
