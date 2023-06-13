package miu.cs425.mystudentmgmt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

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

    public Student() {
    }

    public Student(Long studentId, @NotNull String studentNumber, @NotNull String firstName,
                   @NotNull String middleName, @NotNull String lastName, Double cgpa, Date dateOfEnrollment,
                   Transcript transcript, Classroom classroom) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript = transcript;
        this.classroom = classroom;
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
