package edu.educationapi.educationapi.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseCategoryId;

    private String courseCategoryName;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> course;
}
