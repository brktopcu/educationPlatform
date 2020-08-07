package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Section;
import edu.educationapi.educationapi.model.SectionDto;
import org.mapstruct.Mapper;

@Mapper
public interface SectionMapper {
    SectionDto sectionToSectionDto(Section section);
    Section sectionDtoToSection(SectionDto sectionDto);
}
