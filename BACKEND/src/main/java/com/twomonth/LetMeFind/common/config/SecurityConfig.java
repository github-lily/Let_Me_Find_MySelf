package com.twomonth.LetMeFind.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // CSRF 보호 비활성화 (토큰 기반 인증 사용)
                .csrf(csrf -> csrf.disable())
                // 세션 관리 정책을 STATELESS로 설정 (세션을 사용하지 않음)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // 모든 요청에 대해 인증을 요구
                .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                // OAuth2 리소스 서버 설정 (JWT 검증)
                .oauth2ResourceServer(oauth2 -> oauth2.jwt());

        return http.build();
    }
}
