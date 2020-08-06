package edu.educationapi.educationapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


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

    @Lob
    private byte[] coursePicture;

    @JsonBackReference
    @ManyToOne
    private CourseCategory courseCategory;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @JsonManagedReference
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_course",
            joinColumns = { @JoinColumn(name = "courseId") },
            inverseJoinColumns = { @JoinColumn(name = "userId") }
    )
    private List<User> userList;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    private List<Section> sectionList;
}
