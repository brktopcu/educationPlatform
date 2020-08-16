package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Progress;
import edu.educationapi.educationapi.model.ProgressDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProgressMapper {
    ProgressDto progressToProgressDto(Progress progress);
    Progress progressDtoToProgress(ProgressDto progressDto);
}
