package edu.educationapi.educationapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.educationapi.educationapi.domain.Course;
import edu.educationapi.educationapi.domain.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProgressDto {

    private Long progressId;

    private float progress;

    private Course course;

    //private User user;

    public Long getProgressId() {
        return progressId;
    }

    public float getProgress() {
        return progress;
    }

    public Course getCourse() {
        return course;
    }

    public void setProgressId(Long progressId) {
        this.progressId = progressId;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
