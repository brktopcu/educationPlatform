package edu.educationapi.educationapi.model;

import edu.educationapi.educationapi.domain.Section;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoDto {

    private Long videoId;

    private String videoName;

    private String videoType;

    private byte[] videoData;

    private Section section;


}
