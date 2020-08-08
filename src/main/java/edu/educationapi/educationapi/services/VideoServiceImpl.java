package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.domain.Video;
import edu.educationapi.educationapi.mappers.VideoMapper;
import edu.educationapi.educationapi.model.VideoDto;
import edu.educationapi.educationapi.repositories.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;
    private final VideoMapper videoMapper;

    @Override
    public VideoDto getById(Long videoId) {
        return null;
    }

    @Override
    public List<VideoDto> getVideosBySectionId(Long sectionId) {
        List<VideoDto> videoDtos = new ArrayList<>();
        List<Video> videos;

        videos = videoRepository.findAll();

        videos.forEach(video -> {
            if(video.getSection().getSectionId().equals(sectionId)){
                videoDtos.add(videoMapper.videoToVideoDto(video));
            }
        });

        return videoDtos;
    }

    @Override
    public VideoDto savedNewVideo(VideoDto videoDto) {
        return null;
    }

    @Override
    public VideoDto updateVideo(Long videoId, VideoDto videoDto) {
        return null;
    }
}
