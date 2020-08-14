package edu.educationapi.educationapi.mappers;

import edu.educationapi.educationapi.domain.Document;
import edu.educationapi.educationapi.model.SavedDocumentDto;
import org.mapstruct.Mapper;

@Mapper
public interface SavedDocumentDtoMapper {
    SavedDocumentDto documentToSavedDocumentDto(Document document);

    Document savedDocumentDtoToDocument(SavedDocumentDto savedDocumentDto);

}
