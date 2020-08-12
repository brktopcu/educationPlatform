package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Course;
import edu.educationapi.educationapi.model.SavedCourseDto;
import org.mapstruct.Mapper;

@Mapper
public interface SavedCourseDtoMapper {

    SavedCourseDto courseToSavedCourseDto(Course course);
    Course savedCourseDtoToCourse(SavedCourseDto savedCourseDto);
}
