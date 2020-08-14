package edu.educationapi.educationapi.services;

import edu.educationapi.educationapi.domain.Document;
import edu.educationapi.educationapi.domain.Video;
import edu.educationapi.educationapi.mappers.DocumentMapper;
import edu.educationapi.educationapi.mappers.SavedDocumentDtoMapper;
import edu.educationapi.educationapi.mappers.SavedVideoDtoMapper;
import edu.educationapi.educationapi.model.DocumentDto;
import edu.educationapi.educationapi.model.SavedDocumentDto;
import edu.educationapi.educationapi.model.VideoDto;
import edu.educationapi.educationapi.repositories.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;
    private final DocumentMapper documentMapper;
    private final SavedDocumentDtoMapper savedDocumentDtoMapper;

    @Override
    public DocumentDto getById(Long documentId) {
        return null;
    }

    @Override
    public List<DocumentDto> getDocumentsBySectionId(Long sectionId) {

        List<DocumentDto> documentDtos = new ArrayList<>();
        List<Document> documents;

        documents = documentRepository.findAll();

        documents.forEach(document -> {
            if(document.getSection().getSectionId().equals(sectionId)){
                documentDtos.add(documentMapper.documentToDocumentDto(document));
            }
        });

        return documentDtos;
    }

    @Override
    public SavedDocumentDto savedNewDocument(SavedDocumentDto savedDocumentDto) {
        documentRepository.save(savedDocumentDtoMapper.savedDocumentDtoToDocument(savedDocumentDto));
        return savedDocumentDto;
    }

    @Override
    public DocumentDto updateVideo(Long documentId, DocumentDto documentDto) {
        return null;
    }
}
