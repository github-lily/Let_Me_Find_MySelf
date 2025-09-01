package com.twomonth.LetMeFind.record.model.entity;

import com.twomonth.LetMeFind.common.domin.FeedbackStatus;
import com.twomonth.LetMeFind.common.domin.Reaction;
import com.twomonth.LetMeFind.common.domin.RecordStatus;
import com.twomonth.LetMeFind.common.domin.Weather;
import com.twomonth.LetMeFind.mission.model.entity.MainAssignment;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "main_records")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class MainRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "main_record_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assignment_id", nullable = false)
    private MainAssignment assignment;

    @Enumerated(EnumType.STRING)
    @Column
    @Builder.Default
    private RecordStatus status = RecordStatus.NOT_STARTED;

    // 예약어 컬럼명 그대로 사용: @Column(name="like")
    @Column(name = "like", length = 5000, nullable = false)
    private String likeText;

    @Column(name = "dislike", length = 5000, nullable = false)
    private String dislike;

    @Column(nullable = false)
    private Integer immersion; // 0~100

    @Column(length = 50, nullable = false)
    private String feeling;

    @Column(length = 5000)
    private String other;

    @Column(name = "clear_time")
    private LocalDateTime clearTime;

    @Enumerated(EnumType.STRING)
    @Column
    private Weather weather;

    @Column(length = 5000)
    private String feedback;

    @Enumerated(EnumType.STRING)
    @Column(name = "feedback_status", nullable = false)
    @Builder.Default
    private FeedbackStatus feedbackStatus = FeedbackStatus.NOT_STARTED;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private Reaction reaction = Reaction.NONE;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
