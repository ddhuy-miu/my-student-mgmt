package miu.cs425.mystudentmgmt.repositories;

import miu.cs425.mystudentmgmt.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
