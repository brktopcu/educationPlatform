package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.CourseDto;

public interface CourseService {

    CourseDto getById(Long courseId);

    CourseDto savedNewCourse(CourseDto courseDto);

    CourseDto updateCourse(Long courseId, CourseDto courseDto);
}
