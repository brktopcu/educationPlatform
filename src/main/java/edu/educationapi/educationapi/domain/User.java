package edu.educationapi.educationapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;

    private String userPassword;

    private String email;

    @JsonBackReference
    @ManyToMany(mappedBy = "userList")
    private List<Course> courseList;

}
