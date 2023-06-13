package miu.cs425.mystudentmgmt.repositories;

import miu.cs425.mystudentmgmt.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
