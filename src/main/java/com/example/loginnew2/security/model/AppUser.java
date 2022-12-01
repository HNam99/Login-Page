package com.example.loginnew2.security.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true , length = 20 , nullable = false)
    private String userName;
    private String firstName;
    private String lastName;
    private String role;
    @Column(unique = true , nullable = false)
    private String password;

}
