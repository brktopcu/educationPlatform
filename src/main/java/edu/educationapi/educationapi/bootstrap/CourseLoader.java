package edu.educationapi.educationapi.bootstrap;

import edu.educationapi.educationapi.domain.Course;
import edu.educationapi.educationapi.domain.CourseCategory;
import edu.educationapi.educationapi.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CourseLoader implements CommandLineRunner {

    private final CourseRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
        if(courseRepository.count() == 0){
            loadCourses();
        }

    }

    private void loadCourses(){
        Course c1 = Course.builder()
                .courseName("Java Spring Boot Eğitimi")
                .description("Java kullanarak Spring Boot öğrenin")
                .courseCategory(CourseCategory.YAZILIM)
                .build();

        courseRepository.save(c1);
    }
}
