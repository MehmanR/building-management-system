package com.example.buildingmanagementsysytem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor()
@NoArgsConstructor
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    private List<User> users;
}
