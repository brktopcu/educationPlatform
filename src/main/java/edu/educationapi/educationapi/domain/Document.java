package edu.educationapi.educationapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long documentId;

    private String documentName;

    private String documentType;

    @Lob
    private byte[] data;

    @JsonManagedReference
    @ManyToOne
    private Section section;

    public Document(String name, String type, byte[] data){
        this.documentName=name;
        this.documentType=type;
        this.data=data;
    }
}
