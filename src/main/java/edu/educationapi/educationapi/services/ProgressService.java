package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.ProgressDto;

public interface ProgressService {
    ProgressDto getProgressByCourseId(Long courseId);

    ProgressDto savedNewProgress(ProgressDto progressDto);

    ProgressDto updateProgress(Long courseId, ProgressDto progressDto);
}
