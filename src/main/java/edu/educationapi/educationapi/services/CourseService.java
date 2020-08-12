package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.CourseDto;
import edu.educationapi.educationapi.model.SavedCourseDto;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface CourseService {

    CourseDto getById(Long courseId) throws ChangeSetPersister.NotFoundException;

    List<CourseDto> getAllCourses();

    SavedCourseDto savedNewCourse(SavedCourseDto courseDto);

    CourseDto updateCourse(Long courseId, CourseDto courseDto);
}
