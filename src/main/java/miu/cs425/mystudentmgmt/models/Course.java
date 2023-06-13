package miu.cs425.mystudentmgmt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

    private String courseCode;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course() {
    }
}
