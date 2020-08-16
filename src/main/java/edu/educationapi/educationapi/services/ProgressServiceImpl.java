package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.domain.Progress;
import edu.educationapi.educationapi.mappers.ProgressMapper;
import edu.educationapi.educationapi.model.ProgressDto;
import edu.educationapi.educationapi.repositories.ProgressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgressServiceImpl implements ProgressService {

    private final ProgressRepository progressRepository;
    private final ProgressMapper progressMapper;

    @Override
    public ProgressDto getProgressByCourseId(Long courseId) {
        List<Progress> progresses = progressRepository.findAll();
        Progress[] progressToReturn = new Progress[1];
        progresses.forEach(progress -> {
            if(progress.getCourse().getCourseId().equals(courseId)){
                progressToReturn[0] = progress;
            }
        });
        return progressMapper.progressToProgressDto(progressToReturn[0]);
    }

    @Override
    public ProgressDto savedNewProgress(ProgressDto progressDto) {
      progressRepository.save(progressMapper.progressDtoToProgress(progressDto));
      return progressDto;
    }

    @Override
    public ProgressDto updateProgress(Long courseId, ProgressDto progressDto) {
        List<Progress> progresses = progressRepository.findAll();
        Progress[] progressToReturn = new Progress[1];
        progresses.forEach(progress -> {
            if(progress.getCourse().getCourseId().equals(courseId)){
                progressToReturn[0] = progress;
            }
        });

        progressToReturn[0] = progressMapper.progressDtoToProgress(progressDto);
        progressRepository.save(progressToReturn[0]);
        return progressDto;
    }
}
