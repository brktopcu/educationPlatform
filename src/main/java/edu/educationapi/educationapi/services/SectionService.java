package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.SavedSectionDto;
import edu.educationapi.educationapi.model.SectionDto;

import java.util.List;

public interface SectionService {

    SectionDto getById(Long sessionId);

    List<SectionDto> getAllSessionsByCourseId(Long courseId);

    SavedSectionDto savedNewSession(SavedSectionDto savedSectionDto);

    SectionDto updateSession(Long sessionId, SectionDto sectionDto);

    SectionDto findBySectionNameAndDescription(String sectionName, String sectionDescription);
}
