package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Section;
import edu.educationapi.educationapi.model.SectionDto;
import edu.educationapi.educationapi.model.SectionDtoWCourse;
import org.mapstruct.Mapper;

@Mapper
public interface SectionDtoWCourseMapper {
    SectionDtoWCourse sectionToSectionDtoWCourse(Section section);
    Section sectionDtoWCourseToSection(SectionDtoWCourse sectionDtoWCourse);
}
