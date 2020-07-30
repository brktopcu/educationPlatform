package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.CourseDto;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface CourseService {

    CourseDto getById(Long courseId) throws ChangeSetPersister.NotFoundException;

    CourseDto savedNewCourse(CourseDto courseDto);

    CourseDto updateCourse(Long courseId, CourseDto courseDto);
}
