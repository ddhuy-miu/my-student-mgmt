package miu.cs425.mystudentmgmt.services.impl;

import miu.cs425.mystudentmgmt.models.Classroom;
import miu.cs425.mystudentmgmt.repositories.ClassroomRepository;
import miu.cs425.mystudentmgmt.services.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    private ClassroomRepository repository;

    public ClassroomServiceImpl(ClassroomRepository repository) {
        this.repository = repository;
    }

    @Override
    public Classroom insertClassroom(Classroom classroom) {
        return repository.save(classroom);
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return repository.findAll();
    }

    @Override
    public Optional<Classroom> getClassroomById(Long classroomId) {
        return repository.findById(classroomId);
    }

    @Override
    public Classroom updateClassroom(Classroom classroom) {
        return repository.save(classroom);
    }

    @Override
    public void deleteClassroom(Long classroomId) {
        repository.deleteById(classroomId);
    }

    @Override
    public void deleteClassroom(Classroom classroom) {
        repository.delete(classroom);
    }
}
