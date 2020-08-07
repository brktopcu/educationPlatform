package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {

    //List<Section> findByCourseId(Long courseId);
}
