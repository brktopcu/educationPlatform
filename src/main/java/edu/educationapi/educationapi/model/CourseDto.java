package edu.educationapi.educationapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import edu.educationapi.educationapi.domain.CourseCategory;
import edu.educationapi.educationapi.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import javax.validation.constraints.Null;
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
