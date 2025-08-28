package com.twomonth.LetMeFind.common.auth;

import com.twomonth.LetMeFind.user.model.entity.User;
import com.twomonth.LetMeFind.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    @PostMapping("/auth/kakao")
    public ResponseEntity<?> kakaoAuth(@RequestBody Map<String, String> kakaoUser) {
        String id = kakaoUser.get("id");
        String email = kakaoUser.get("email");
        String nickname = kakaoUser.get("nickname");

        // DB 조회
        User user = userRepository.findById(id).orElseGet(() -> {
            // 신규 유저 생성
            User newUser = User.builder()
                    .id(id)
                    .email(email)
                    .nickname(nickname)
                    .build();
            return userRepository.save(newUser);
        });

        // JWT 발급
        String accessToken = jwtService.generateAccessToken(user.getId());

        // JWT를 Response Header에 담아서 전송
        return ResponseEntity.ok()
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                .body(Map.of("message", "Login success", "userId", user.getId()));
    }
}

