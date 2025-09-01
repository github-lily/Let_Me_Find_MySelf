package com.twomonth.LetMeFind.mission.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "sub_missions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class SubMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_mission_id")
    private Long id;

    @Column(length = 250, nullable = false)
    private String title;

    @OneToMany(mappedBy = "subMission")
    private List<SubAssignment> assignments;
}
