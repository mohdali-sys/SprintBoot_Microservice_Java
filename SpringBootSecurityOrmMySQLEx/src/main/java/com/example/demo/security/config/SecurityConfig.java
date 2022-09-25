package com.example.demo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private BCryptPasswordEncoder encoder;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/user/register", "/user/save").permitAll().antMatchers("/welcome")
				.permitAll().antMatchers("/home").authenticated()

				.antMatchers("/admin").hasAuthority("ADMIN").antMatchers("/emp").hasAuthority("EMPLOYEE").anyRequest()
				.authenticated()

				.and().formLogin().defaultSuccessUrl("/home", true)

				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

				.and().exceptionHandling().accessDeniedPage("/denied")

		;
	}

}
