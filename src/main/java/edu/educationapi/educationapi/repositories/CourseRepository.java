package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findFirstByCourseNameAndCourseDescription(String courseName,String courseDescription);
}
