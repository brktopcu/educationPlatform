package edu.educationapi.educationapi.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

    private String courseName;

    private String description;

    private CourseCategory courseCategory;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    private String instructorId;







}
