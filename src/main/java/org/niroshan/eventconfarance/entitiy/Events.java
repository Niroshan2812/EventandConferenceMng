package org.niroshan.eventconfarance.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Events {
    @Id
    private String eventId;
    private String eventName;
    private String eventDescription;
    private String eventDate;
    private String startTime;
    private String endTime;

    @DBRef
    private Venue venue;

    @DBRef
    private Users organizer;

    private int maxAttendees;
    private String createdAt;
    private String updatedAt;
}
