package com.example.buildingmanagementsysytem.model;

import com.example.buildingmanagementsysytem.enums.PayingType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor()
@NoArgsConstructor
@ToString
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "room_number",nullable = false,unique = true)
    private String roomNumber;

    @Column(nullable = false)
    private double capacity;

    @Column(name = "room_price",nullable = false)
    private double roomPrice;

    @Column(nullable = false)
    private int floor;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "pay_date",nullable = false)
    private LocalDate payDate;

    @Column(name = "available",nullable = false)
    private boolean isActive;

    @Enumerated(EnumType.STRING)
    private PayingType payingType;

    @ManyToOne
    private Building building;

    @ManyToOne
    private Company company;


}
