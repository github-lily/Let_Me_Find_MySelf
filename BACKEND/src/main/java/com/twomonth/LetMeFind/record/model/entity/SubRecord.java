package com.twomonth.LetMeFind.record.model.entity;

import com.twomonth.LetMeFind.common.domin.RecordStatus;
import com.twomonth.LetMeFind.mission.model.entity.SubAssignment;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "sub_records")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class SubRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_record_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assignment_id", nullable = false)
    private SubAssignment assignment;

    @Column(length = 1000, nullable = false)
    private String answer;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RecordStatus status = RecordStatus.NOT_STARTED;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
