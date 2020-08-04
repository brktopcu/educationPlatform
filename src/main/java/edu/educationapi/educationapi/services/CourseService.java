package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.CourseDto;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface CourseService {

    CourseDto getById(Long courseId) throws ChangeSetPersister.NotFoundException;

    List<CourseDto> getAllCourses();

    CourseDto savedNewCourse(CourseDto courseDto);

    CourseDto updateCourse(Long courseId, CourseDto courseDto);
}
