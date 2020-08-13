package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Section;
import edu.educationapi.educationapi.model.SavedSectionDto;
import org.mapstruct.Mapper;

@Mapper
public interface SavedSectionDtoMapper {
    SavedSectionDto sectionToSavedSectionDto(Section section);
    Section savedSectionDtoToSection(SavedSectionDto savedSectionDto);
}
