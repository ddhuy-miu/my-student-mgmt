package miu.cs425.mystudentmgmt.services;


import miu.cs425.mystudentmgmt.models.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {
    public Classroom insertClassroom(Classroom classroom);

    public List<Classroom> getAllClassrooms();

    public Optional<Classroom> getClassroomById(Long classroomId);

    public Classroom updateClassroom(Classroom classroom);

    public void deleteClassroom(Long classroomId);

    public void deleteClassroom(Classroom classroom);
}
