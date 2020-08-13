package edu.educationapi.educationapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.educationapi.educationapi.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SectionDto {

    private Long sectionId;

    private String sectionName;

    private String sectionDescription;

    @JsonIgnore
    private Course course;

}
