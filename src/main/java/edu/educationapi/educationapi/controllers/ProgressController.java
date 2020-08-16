package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.domain.Progress;
import edu.educationapi.educationapi.model.ProgressDto;
import edu.educationapi.educationapi.services.ProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/progresses")
public class ProgressController {
    private final ProgressService progressService;

    @GetMapping("/{courseId}")
    public ResponseEntity<ProgressDto> getProgressByCourseId(@PathVariable("courseId") Long courseId){

       return new ResponseEntity<>(progressService.getProgressByCourseId(courseId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handleProgressPost(@RequestBody ProgressDto progressDto){

        progressService.savedNewProgress(progressDto);

        return new ResponseEntity(HttpStatus.CREATED);

    }

    @PutMapping("/update/{courseId}")
    public ResponseEntity handleProgressUpdate(@PathVariable("courseId") Long courseId,
                                               @RequestBody ProgressDto progressDto){
        progressService.updateProgress(courseId,progressDto);

        return new ResponseEntity(HttpStatus.OK);
    }
}
