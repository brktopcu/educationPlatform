package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.model.DocumentDto;
import edu.educationapi.educationapi.model.VideoDto;
import edu.educationapi.educationapi.services.DocumentService;
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
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService documentService;

    @GetMapping("/{sectionId}")
    public ResponseEntity<List<DocumentDto>> getDocumentsBySectionId(@PathVariable("sectionId") Long sectionId){

        return new ResponseEntity<>(documentService.getDocumentsBySectionId(sectionId), HttpStatus.OK);
    }
}