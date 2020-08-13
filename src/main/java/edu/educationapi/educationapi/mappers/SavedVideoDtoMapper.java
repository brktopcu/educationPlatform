package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Video;
import edu.educationapi.educationapi.model.SavedVideoDto;
import org.mapstruct.Mapper;

@Mapper
public interface SavedVideoDtoMapper {
    SavedVideoDto videoToSavedVideoDto(Video video);
    Video savedVideoDtoToVideo(SavedVideoDto savedVideoDto);
}
