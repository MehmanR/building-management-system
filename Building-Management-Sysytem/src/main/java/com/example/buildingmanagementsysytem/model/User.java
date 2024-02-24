package com.example.buildingmanagementsysytem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/*


 */
@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor()
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "birth_date",nullable = false)
    private String birthDate;

    @Column(name = "phone_number",nullable = false,unique = true)
    private String phoneNumber;

    @Column(name = "created_date",nullable = false)
    private LocalDate createdDate;

    @Column(name = "accessible",nullable = false)
    private boolean isBlocked;

    @ManyToMany
    private List<Role> roles;
}
