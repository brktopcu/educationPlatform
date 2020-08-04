package edu.educationapi.educationapi.repositories;

import edu.educationapi.educationapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
