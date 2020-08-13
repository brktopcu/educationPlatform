package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.domain.Course;
import edu.educationapi.educationapi.domain.CourseCategory;
import edu.educationapi.educationapi.mappers.CourseMapper;
import edu.educationapi.educationapi.mappers.SavedCourseDtoMapper;
import edu.educationapi.educationapi.model.CourseDto;
import edu.educationapi.educationapi.model.SavedCourseDto;
import edu.educationapi.educationapi.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;
    private final SavedCourseDtoMapper savedCourseDtoMapper;



    @Override
    public CourseDto getById(Long courseId) throws ChangeSetPersister.NotFoundException {
        return courseMapper.courseToCourseDto(courseRepository.findById(courseId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new));
    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<CourseDto> courses = new ArrayList<>();
        courseRepository.findAll().forEach(
                course -> {
                    courses.add(courseMapper.courseToCourseDto(course));
                }
        );
        return courses;
    }


    @Override
    public SavedCourseDto savedNewCourse(SavedCourseDto savedCourseDto) {

        courseRepository.save(savedCourseDtoMapper.savedCourseDtoToCourse(savedCourseDto));

        return savedCourseDto;
    }

    @Override
    public CourseDto updateCourse(Long courseId, CourseDto courseDto) {
        return null;
    }

    @Override
    public void deleteByCourseId(Long courseId) {
        courseRepository.deleteById(courseId);
    }
}
