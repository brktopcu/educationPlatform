package edu.educationapi.educationapi.model;

import edu.educationapi.educationapi.domain.CourseCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto {


    private Long courseId;

    private String courseName;

    private String description;

    private CourseCategory courseCategory;


    private Timestamp createdDate;

    private String instructorId;

}
