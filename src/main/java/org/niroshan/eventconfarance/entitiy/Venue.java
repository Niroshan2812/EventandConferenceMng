package org.niroshan.eventconfarance.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "venue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Venue {
    @Id
    private String venueId;
    private String venueName;
    private String location;
    private int capacity;
    private String floorPlan; // URL or file path
    private String createdAt;
    private String updatedAt;
}
