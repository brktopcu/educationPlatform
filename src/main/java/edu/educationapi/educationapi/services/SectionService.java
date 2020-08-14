package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.SavedSectionDto;
import edu.educationapi.educationapi.model.SectionDto;
import edu.educationapi.educationapi.model.SectionDtoWCourse;

import java.util.List;

public interface SectionService {

    SectionDto getById(Long sessionId);

    List<SectionDto> getAllSessionsByCourseId(Long courseId);

    SavedSectionDto savedNewSession(SavedSectionDto savedSectionDto);

    SectionDto updateSession(Long sessionId, SectionDto sectionDto);

    SectionDtoWCourse findBySectionNameAndDescription(String sectionName, String sectionDescription);
}
