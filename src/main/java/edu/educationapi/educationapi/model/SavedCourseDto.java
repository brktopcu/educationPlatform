package edu.educationapi.educationapi.model;

import edu.educationapi.educationapi.domain.CourseCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavedCourseDto {

    private String courseName;

    private String courseDescription;

    //private CourseCategory courseCategory;

    private byte[] coursePicture;
}
