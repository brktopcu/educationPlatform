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

        Course c2 = Course.builder()
                .courseName("Jira Eğitimi")
                .description("Jira ile çevik proje yönetimini öğrenin")
                .courseCategory(CourseCategory.YAZILIM)
                .build();

        Course c3 = Course.builder()
                .courseName("Satış ve Pazarlama Eğitimi")
                .description("Satış ve Pazarlamanın Temellerini Öğrenin")
                .courseCategory(CourseCategory.PAZARLAMA)
                .build();


        courseRepository.save(c1);
        courseRepository.save(c2);
        courseRepository.save(c3);

        System.out.println("Courses Loaded!");
    }
}
