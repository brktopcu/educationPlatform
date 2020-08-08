package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.model.VideoDto;
import edu.educationapi.educationapi.services.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/videos")
public class VideoController {

    private final VideoService videoService;

    @GetMapping("/{sectionId}")
    public ResponseEntity<List<VideoDto>> getVideosBySectionId(@PathVariable("sectionId") Long sectionId){

        return new ResponseEntity<>(videoService.getVideosBySectionId(sectionId), HttpStatus.OK);
    }
}
