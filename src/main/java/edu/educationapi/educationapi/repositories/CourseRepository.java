package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
