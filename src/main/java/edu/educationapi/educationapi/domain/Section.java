package edu.educationapi.educationapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sectionId;

    private String sectionName;

    private String sectionDescription;

    @JsonBackReference
    @ManyToOne
    private Course course;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    private List<Document> documentList;

    @OneToOne(cascade = CascadeType.ALL)
    private Video video;

}
