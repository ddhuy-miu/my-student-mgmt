package miu.cs425.mystudentmgmt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

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

    public Student() {
    }

    public Student(Long studentId, @NotNull String studentNumber, @NotNull String firstName,
                   @NotNull String middleName, @NotNull String lastName, Double cgpa, Date dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public @NotNull String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(@NotNull String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public @NotNull String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    public @NotNull String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(@NotNull String middleName) {
        this.middleName = middleName;
    }

    public @NotNull String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Date getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(Date dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
}
