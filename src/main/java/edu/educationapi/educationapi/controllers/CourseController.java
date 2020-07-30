package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.model.CourseDto;
import edu.educationapi.educationapi.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{courseId}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable("courseId") Long courseId) throws ChangeSetPersister.NotFoundException {

        return new ResponseEntity<>(courseService.getById(courseId), HttpStatus.OK);

    }


}
