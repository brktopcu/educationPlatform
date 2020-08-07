package edu.educationapi.educationapi.model;

import edu.educationapi.educationapi.domain.CourseCategory;
import edu.educationapi.educationapi.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto {
    
    private Long courseId;

    private String courseName;

    private String courseDescription;

    private CourseCategory courseCategory;

    private byte[] coursePicture;

    private Timestamp createdDate;

}
