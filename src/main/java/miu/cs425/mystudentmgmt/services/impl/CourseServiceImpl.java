package miu.cs425.mystudentmgmt.services.impl;

import miu.cs425.mystudentmgmt.models.Course;
import miu.cs425.mystudentmgmt.repositories.CourseRepository;
import miu.cs425.mystudentmgmt.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Course insertCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(Long courseId) {
        return repository.findById(courseId);
    }

    @Override
    public Course updateCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        repository.deleteById(courseId);
    }

    @Override
    public void deleteCourse(Course course) {
        repository.delete(course);
    }
}
