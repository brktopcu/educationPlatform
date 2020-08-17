package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Document;
import edu.educationapi.educationapi.model.DocumentDto;
import org.mapstruct.Mapper;

@Mapper
public interface DocumentMapper {
    DocumentDto documentToDocumentDto(Document document);
    Document documentDtoToDocument(DocumentDto documentDto);
}
