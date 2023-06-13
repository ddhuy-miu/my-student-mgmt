package miu.cs425.mystudentmgmt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    @NotNull
    @NotBlank
    private String studentNumber;

    @NotNull
    @NotBlank
    private String firstName;

    @NotNull
    @NotBlank
    private String middleName;

    @NotNull
    @NotBlank
    private String lastName;

    private Double cgpa;

    private Date dateOfEnrollment;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "transcriptId", referencedColumnName = "transcriptId")
    private Transcript transcript;

    @ManyToOne
    @JoinColumn(name = "classroomId", referencedColumnName = "classroomId")
    private Classroom classroom;

    @ManyToMany
    @JoinTable(name = "students_courses",
            joinColumns = {@JoinColumn(name = "studentId", referencedColumnName = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "courseId", referencedColumnName = "courseId")})
    private List<Course> courses;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", cgpa='" + cgpa + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", transcript='" + transcript + '\'' +
                '}';
    }
}
