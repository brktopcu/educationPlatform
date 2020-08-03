package edu.educationapi.educationapi.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    private String courseDescription;

    private CourseCategory courseCategory;

    private byte[] coursePicture;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    //private String userId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<Document> documentList;
}
