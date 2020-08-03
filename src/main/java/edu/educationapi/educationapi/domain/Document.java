package edu.educationapi.educationapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long documentId;

    private String documentName;

    private String documentType;

    @Lob
    private byte[] data;

    //TODO Fix and test hibernate relationship
    @ManyToOne
    private Course course;

    public Document(String name, String type, byte[] data){
        this.documentName=name;
        this.documentType=type;
        this.data=data;
    }
}
