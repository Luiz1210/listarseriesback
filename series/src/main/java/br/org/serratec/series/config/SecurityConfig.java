package br.org.serratec.series.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().permitAll() // Permite todas as solicitações sem autenticação
                .and()
            .csrf().disable(); // Desabilita a proteção CSRF (opcional, dependendo das necessidades do seu aplicativo)
        return http.build();
    }
}
