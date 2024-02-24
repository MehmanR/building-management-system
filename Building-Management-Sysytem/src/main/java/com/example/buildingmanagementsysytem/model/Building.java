package com.example.buildingmanagementsysytem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false,unique = true)
    private String address;

    @Column(nullable = false)
    private int floor;

    @Column(nullable = false)
    private double capacity;

    @Column(nullable = false)
    @OneToMany
    private List<Room> rooms;


}
