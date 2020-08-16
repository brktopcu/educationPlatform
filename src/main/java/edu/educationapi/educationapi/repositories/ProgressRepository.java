package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress,Long> {
}
