package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.model.SavedCourseDto;
import edu.educationapi.educationapi.model.SavedSectionDto;
import edu.educationapi.educationapi.model.SectionDto;
import edu.educationapi.educationapi.model.SectionDtoWCourse;
import edu.educationapi.educationapi.services.SectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
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

    @GetMapping("/getSection/{sectionName}/{sectionDescription}")
    public ResponseEntity<SectionDtoWCourse> getSectionsByNameAndDesc(
            @PathVariable("sectionName") String sectionName,
            @PathVariable("sectionDescription") String sectionDescription){

        byte[] decodedNameBytes = Base64.getDecoder().decode(sectionName);
        String decodedName = new String(decodedNameBytes);

        byte[] decodedDescBytes = Base64.getDecoder().decode(sectionDescription);
        String decodedDescription = new String(decodedDescBytes);


        return new ResponseEntity<>(sectionService
                .findBySectionNameAndDescription(decodedName,decodedDescription), HttpStatus.OK);

    }

}
