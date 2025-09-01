package com.twomonth.LetMeFind.mission.model.entity;

import com.twomonth.LetMeFind.common.domin.SubAssignmentStatus;
import com.twomonth.LetMeFind.record.model.entity.SubRecord;
import com.twomonth.LetMeFind.user.model.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sub_assignments")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class SubAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sub_mission_id", nullable = false)
    private SubMission subMission;

    @Column(name = "expires_at", nullable = false)
    private LocalDateTime expiresAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private SubAssignmentStatus status = SubAssignmentStatus.NOT_STARTED;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "assignment")
    private List<SubRecord> records;
}
