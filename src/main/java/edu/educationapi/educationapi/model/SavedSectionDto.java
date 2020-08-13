package edu.educationapi.educationapi.model;

import edu.educationapi.educationapi.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SavedSectionDto {

    private String sectionName;

    private String sectionDescription;

    private Course course;
}
