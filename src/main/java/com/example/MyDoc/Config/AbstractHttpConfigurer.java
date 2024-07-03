package com.example.MyDoc.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;

public interface AbstractHttpConfigurer {
    static void disable(CsrfConfigurer<HttpSecurity> httpSecurityCsrfConfigurer) {
    }
}
