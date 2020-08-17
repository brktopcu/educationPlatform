package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Video;
import edu.educationapi.educationapi.model.VideoDto;
import org.mapstruct.Mapper;

@Mapper
public interface VideoMapper {
    VideoDto videoToVideoDto(Video video);
    Video videoDtoToVideo(VideoDto videoDto);
}