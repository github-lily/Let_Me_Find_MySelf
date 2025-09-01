package com.twomonth.LetMeFind.mission.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "main_missions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class MainMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mission_id")
    private Long id;

    @Column(length = 250, nullable = false)
    private String title;

    @Column(length = 1000)
    private String details;

    @Column(length = 1000)
    private String expectation;

    @OneToMany(mappedBy = "mission")
    private List<MainAssignment> assignments;
}
