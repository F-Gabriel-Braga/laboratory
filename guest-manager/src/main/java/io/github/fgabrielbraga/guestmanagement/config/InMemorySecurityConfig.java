package io.github.fgabrielbraga.guestmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
        builder
                .inMemoryAuthentication()
                .withUser("gabriel").password("{noop}1452").roles("USER")
                .and()
                .withUser("estefane").password("{noop}5236").roles("USER")
                .and()
                .withUser("ana").password("{noop}1234").roles("USER");
    }
}
