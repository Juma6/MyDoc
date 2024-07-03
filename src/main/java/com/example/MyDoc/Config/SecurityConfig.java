package com.example.MyDoc.Config;

import jakarta.validation.constraints.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(@NotNull HttpSecurity http) throws Exception {
        HttpSecurity httpSecurity = http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth.requestMatchers(
                                "/v2/api-docs",
                                "/api/v1/auth/**",
                                "/api/v1/forex/**",
                                "/api/**",
                                "/api-docs",
                                "/api-docs/**",
                                "/v3/api-docs",
                                "/v3/api-docs/**",
                                "/swagger-ui/**",
                                "v2/api-docs/**",
                                "/configuration/ui",
                                "/swagger-resources/**",
                                "/swagger-resources",
                                "/configuration/security",
                                "/swagger-ui/**",
                                "/webjars/**",
                                "/swagger-ui.html",
                                "/swagger-resources/configuration/ui",
                                "/swagger-ui/index.html",
                                "/error/**",
                                "/api/v1/payment/callback").permitAll()
                        .anyRequest().authenticated())
                .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


        return http.build();
    }


}
