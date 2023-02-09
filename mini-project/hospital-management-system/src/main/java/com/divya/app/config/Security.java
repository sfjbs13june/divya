package com.divya.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
    private static final String[] AUTH_LIST ={
            "/swagger-ui/**",
            "/swagger=resources/**"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/doctor/doctor-appointment").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.POST, "/doctor/save").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.GET, "/view/prescription").hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(HttpMethod.POST, "/save/prescription").hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(HttpMethod.POST,"/patient/save").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.GET,"/patient/my-appointment").hasAnyRole("PATIENT")
                .and().csrf().disable().headers()
                .frameOptions().disable();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("doc123").password("{noop}password").roles("DOCTOR").and()
                .withUser("pat123").password("{noop}password").roles("PATIENT").and()
                .withUser("pat345").password("{noop}password").roles("PATIENT").and()
                .withUser("doc345").password("{noop}password").roles("DOCTOR");
    }


}
