package edu.educationapi.educationapi.bootstrap;

import edu.educationapi.educationapi.domain.Course;
import edu.educationapi.educationapi.domain.CourseCategory;
import edu.educationapi.educationapi.domain.User;
import edu.educationapi.educationapi.repositories.CourseRepository;
import edu.educationapi.educationapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;

@RequiredArgsConstructor
@Component
public class CourseLoader implements CommandLineRunner {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    List<User> list1 = new ArrayList<>();
    List<User> list2 = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        if(courseRepository.count() == 0){
            loadUsers();
            loadCourses();
        }
    }

    private void loadCourses() {


        Course c1 = Course.builder()
                .courseName("Java Spring Boot Eğitimi")
                .courseDescription("Java kullanarak Spring Boot öğrenin")
                .courseCategory(CourseCategory.YAZILIM)
                .userList(list1)
                .build();

        Course c2 = Course.builder()
                .courseName("Jira Eğitimi")
                .courseDescription("Jira ile çevik proje yönetimini öğrenin")
                .courseCategory(CourseCategory.YAZILIM)
                .userList(list2)
                .build();

        Course c3 = Course.builder()
                .courseName("Satış ve Pazarlama Eğitimi")
                .courseDescription("Satış ve Pazarlamanın Temellerini Öğrenin")
                .courseCategory(CourseCategory.PAZARLAMA)
                .userList(list1)
                .build();


        courseRepository.save(c1);
        courseRepository.save(c2);
        courseRepository.save(c3);

        System.out.println("Courses Loaded!");
    }

    private void loadUsers(){

        User u1 = User.builder()
                .userName("user1")
                .build();
        User u2 = User.builder()
                .userName("user2")
                .build();

        userRepository.save(u1);
        userRepository.save(u2);

        list1.add(u1);
        list1.add(u2);
        list2.add(u1);


        System.out.println("Users Loaded!");

    }
}
