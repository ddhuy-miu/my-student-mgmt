package miu.cs425.mystudentmgmt.repositories;

import miu.cs425.mystudentmgmt.models.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends JpaRepository<Transcript, Long> {
}
