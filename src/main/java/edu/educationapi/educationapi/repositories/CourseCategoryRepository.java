package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCategoryRepository extends JpaRepository<CourseCategory, Long> {
}
