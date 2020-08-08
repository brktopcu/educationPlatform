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

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name ="course_id")
    private Course course;

    @JsonBackReference
    @OneToMany(mappedBy = "section",cascade = CascadeType.ALL)
    private List<Document> documents;

    @JsonBackReference
    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
    private List<Video> videos;

}
