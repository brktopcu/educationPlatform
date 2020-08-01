package edu.educationapi.educationapi.controllers;

import edu.educationapi.educationapi.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UploadController {
    @Autowired
    private FileService fileStorageService;

    @PostMapping("/uploadFile")
    public Response uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileStorageService.storeFile(file).getDocumentName();

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new Response(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

}
