package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.model.SavedCourseDto;
import edu.educationapi.educationapi.model.SavedSectionDto;
import edu.educationapi.educationapi.model.SectionDto;
import edu.educationapi.educationapi.services.SectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sections")
public class SectionController {

    private final SectionService sectionService;

    @GetMapping("/{courseId}")
    public ResponseEntity<List<SectionDto>> getSectionsByCourseId(@PathVariable("courseId") Long courseId){

        return new ResponseEntity<>(sectionService.getAllSessionsByCourseId(courseId), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody SavedSectionDto savedSectionDto){

        sectionService.savedNewSession(savedSectionDto);

        return new ResponseEntity(HttpStatus.CREATED);
    }

}
