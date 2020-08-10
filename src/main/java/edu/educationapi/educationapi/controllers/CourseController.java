package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.model.CourseDto;
import edu.educationapi.educationapi.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{courseId}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable("courseId") Long courseId) throws ChangeSetPersister.NotFoundException {

        return new ResponseEntity<>(courseService.getById(courseId), HttpStatus.OK);

    }

    @GetMapping("/all")
    public ResponseEntity<List<CourseDto>> getAllCourses(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CourseDto courseDto){

        CourseDto savedCourseDto = courseService.savedNewCourse(courseDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/courses/" + savedCourseDto
                .getCourseId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }


}
