package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.domain.Document;
import edu.educationapi.educationapi.domain.Section;
import edu.educationapi.educationapi.exceptions.FileStorageException;
import edu.educationapi.educationapi.exceptions.NotFoundException;
import edu.educationapi.educationapi.properties.FileStorageProperties;
import edu.educationapi.educationapi.repositories.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
@RequiredArgsConstructor
public class FileService {

    private final DocumentRepository documentRepository;

    public Document storeFile(MultipartFile file, Section section) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {

            if (fileName.contains("..")) {
                throw new FileStorageException();
            }

            Document dbFile = new Document(fileName, file.getContentType(), file.getBytes());
            dbFile.setSection(section);

            return documentRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException();
        }
    }

    public Document getFile(Long fileId) {
        return documentRepository.findById(fileId)
                .orElseThrow();
    }
}
