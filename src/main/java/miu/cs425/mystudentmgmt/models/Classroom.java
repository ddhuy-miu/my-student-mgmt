package miu.cs425.mystudentmgmt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Entity
@Table(name = "Classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classroomId;

    private String buildingName;

    private String roomNumber;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students;

    public Classroom() {
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Classroom{" +
                "classroomId=" + classroomId +
                ", buildingName='" + buildingName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                "}\n");
        for (Student student : students) {
            s.append("\t").append(student.toString()).append("\n");
        }
        return s.toString();
    }
}
