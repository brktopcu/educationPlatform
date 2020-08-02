package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.domain.Document;
import edu.educationapi.educationapi.services.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class DownloadController {

    @Autowired
    private final FileService fileService;

    @GetMapping("/downloadFile/{fileId}")
    public ResponseEntity <Resource> downloadFile(@PathVariable Long fileId, HttpServletRequest request) {

        Document databaseFile = fileService.getFile(fileId);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(databaseFile.getDocumentType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + databaseFile.getDocumentName() + "\"")
                .body(new ByteArrayResource(databaseFile.getData()));
    }
}
