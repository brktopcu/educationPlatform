package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
