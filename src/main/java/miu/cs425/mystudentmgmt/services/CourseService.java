package miu.cs425.mystudentmgmt.services;

import miu.cs425.mystudentmgmt.models.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public Course insertCourse(Course course);

    public List<Course> getAllCourses();

    public Optional<Course> getCourseById(Long courseId);

    public Course updateCourse(Course course);

    public void deleteCourse(Long courseId);

    public void deleteCourse(Course course);
}
