package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
