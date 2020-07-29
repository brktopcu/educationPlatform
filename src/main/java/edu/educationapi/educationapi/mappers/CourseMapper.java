package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Course;
import edu.educationapi.educationapi.model.CourseDto;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper {
    CourseDto courseToCourseDto(Course course);
    Course courseDtoToCourse(CourseDto courseDto);
}
