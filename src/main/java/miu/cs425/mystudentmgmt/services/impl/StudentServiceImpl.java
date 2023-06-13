package miu.cs425.mystudentmgmt.services.impl;

import miu.cs425.mystudentmgmt.models.Student;
import miu.cs425.mystudentmgmt.repositories.StudentRepository;
import miu.cs425.mystudentmgmt.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    //    @Autowired
    private StudentRepository studentRepository; // Field Injection

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
