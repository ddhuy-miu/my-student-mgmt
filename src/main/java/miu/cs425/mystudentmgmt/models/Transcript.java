package miu.cs425.mystudentmgmt.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transcripts")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transcriptId;

    private String degreeTitle;

    @OneToOne(mappedBy = "transcript")
    private Student student;

    public Transcript() {
    }

    public Transcript(Long transcriptId, String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "transcriptId=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +
                '}';
    }
}
