package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.VideoDto;

import java.util.List;

public interface VideoService {

    VideoDto getById(Long videoId);

    List<VideoDto> getVideosBySectionId(Long sectionId);

    VideoDto savedNewVideo(VideoDto videoDto);

    VideoDto updateVideo(Long videoId, VideoDto videoDto);
}
