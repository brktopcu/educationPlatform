package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.SectionDto;

import java.util.List;

public interface SectionService {

    SectionDto getById(Long sessionId);

    List<SectionDto> getAllSessionsByCourseId(Long courseId);

    SectionDto savedNewSession(SectionDto sectionDto);

    SectionDto updateSession(Long sessionId, SectionDto sectionDto);
}
