package com.twomonth.LetMeFind.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String id; // 카카오 userId (Long → String 변환)
    private String email;
    private String nickname;
}

