package miu.cs425.mystudentmgmt.repositories;

import miu.cs425.mystudentmgmt.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
