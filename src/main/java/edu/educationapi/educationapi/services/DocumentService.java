package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.model.DocumentDto;
import edu.educationapi.educationapi.model.VideoDto;

import java.util.List;

public interface DocumentService {
    DocumentDto getById(Long documentId);

    List<DocumentDto> getDocumentsBySectionId(Long sectionId);

    DocumentDto savedNewDocument(DocumentDto documentDto);

    DocumentDto updateVideo(Long documentId, DocumentDto documentDto);
}
