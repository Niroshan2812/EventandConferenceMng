package org.niroshan.eventconfarance.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password; // Store as a hashed value
    private String role;
    private String phone;
    private String profilePicture; // URL or base64 string
    private String createdAt;
    private String updatedAt;
}
