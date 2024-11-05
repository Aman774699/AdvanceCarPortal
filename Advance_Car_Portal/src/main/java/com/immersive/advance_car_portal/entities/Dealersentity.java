package com.immersive.advance_car_portal.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dealers")
public class Dealersentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long dealerId;
    @OneToOne
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private Adminentity admin;
    private String dealershipName;
    private String location;
    private String contactInfo;
    private Double rating;

    @OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Carsentity> cars;
    // One-to-Many relationship with Reviews
    @OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReviewsEntity> reviews;
}
