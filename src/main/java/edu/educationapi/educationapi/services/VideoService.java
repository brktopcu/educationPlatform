package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.SavedVideoDto;
import edu.educationapi.educationapi.model.VideoDto;

import java.util.List;

public interface VideoService {

    VideoDto getById(Long videoId);

    List<VideoDto> getVideosBySectionId(Long sectionId);

    SavedVideoDto savedNewVideo(SavedVideoDto savedVideoDto);

    VideoDto updateVideo(Long videoId, VideoDto videoDto);

    void updateVideoCheckbox(Long videoId);
}
