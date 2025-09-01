package com.twomonth.LetMeFind.user.model.entity;

import com.twomonth.LetMeFind.common.domin.ActiveStatus;
import com.twomonth.LetMeFind.common.domin.Gender;
import com.twomonth.LetMeFind.common.domin.Provider;
import com.twomonth.LetMeFind.mission.model.entity.MainAssignment;
import com.twomonth.LetMeFind.mission.model.entity.SubAssignment;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String id; // 카카오 userId (Long → String 변환)

    @Column(length = 20, nullable = false)
    private String nickname;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Provider provider;

    @Column(name = "provider_id", length = 100, nullable = false)
    private String providerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "is_active", nullable = false)
    @Builder.Default
    private ActiveStatus isActive = ActiveStatus.ACTIVATED;

    @Column(nullable = false)
    @Builder.Default
    private Integer stamp = 0;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // 관계정의 (optional convenience)
    @OneToMany(mappedBy = "user")
    private List<MainAssignment> mainAssignments;

    @OneToMany(mappedBy = "user")
    private List<SubAssignment> subAssignments;

//    @OneToMany(mappedBy = "user")
//    private List<Report> reports;
}

