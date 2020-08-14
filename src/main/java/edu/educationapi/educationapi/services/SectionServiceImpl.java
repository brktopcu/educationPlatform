package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.domain.Section;
import edu.educationapi.educationapi.mappers.SavedSectionDtoMapper;
import edu.educationapi.educationapi.mappers.SectionDtoWCourseMapper;
import edu.educationapi.educationapi.mappers.SectionMapper;
import edu.educationapi.educationapi.model.SavedSectionDto;
import edu.educationapi.educationapi.model.SectionDto;
import edu.educationapi.educationapi.model.SectionDtoWCourse;
import edu.educationapi.educationapi.repositories.SectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SectionServiceImpl implements SectionService {

    private final SectionRepository sectionRepository;
    private final SectionMapper sectionMapper;
    private final SavedSectionDtoMapper savedSectionDtoMapper;
    private final SectionDtoWCourseMapper sectionDtoWCourseMapper;


    @Override
    public SectionDto getById(Long sessionId) {
        return null;
    }

    @Override
    public List<SectionDto> getAllSessionsByCourseId(Long courseId) {
        List<Section> sections;
        List<SectionDto> sectionDtos = new ArrayList<>();

        sections = sectionRepository.findAll();
        sections.forEach(section -> {
            if(section.getCourse().getCourseId().equals(courseId)) {
                sectionDtos.add(sectionMapper.sectionToSectionDto(section));
            }
        });

        return sectionDtos;
    }

    @Override
    public SavedSectionDto savedNewSession(SavedSectionDto savedSectionDto) {

        sectionRepository.save(savedSectionDtoMapper.savedSectionDtoToSection(savedSectionDto));

        return savedSectionDto;
    }

    @Override
    public SectionDto updateSession(Long sessionId, SectionDto sectionDto) {
        return null;
    }

    @Override
    public SectionDtoWCourse findBySectionNameAndDescription(String sectionName, String sectionDescription) {
        return sectionDtoWCourseMapper.sectionToSectionDtoWCourse(sectionRepository
                .findFirstBySectionNameAndAndSectionDescription(sectionName,sectionDescription));
    }
}
