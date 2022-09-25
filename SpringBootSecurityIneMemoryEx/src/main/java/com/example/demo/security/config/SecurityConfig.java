package com.example.demo.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	
	// For Authentication configration
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.inMemoryAuthentication().withUser("SAM").password("{noop}SAM").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("AJAY").password("{noop}AJAY").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("SYED").password("{noop}SYED").authorities("STUDENT");
	

	}
	
	// For Authorization  configration
 @Override
protected void configure(HttpSecurity http) throws Exception {
	// TODO Auto-generated method stub
	 // Url access type
	http.authorizeHttpRequests().antMatchers("/welcome").permitAll()
	.antMatchers("/home").authenticated()
	.antMatchers("/admin").hasAuthority("ADMIN")
	.antMatchers("/emp").hasAuthority("EMPLOYEE")
	.anyRequest().authenticated()
	.and()
	// Login form details
	.formLogin()
	.defaultSuccessUrl("/home", true)
	.and()
	// Logout form details
	.logout()
	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	.and()
	// exception details
	.exceptionHandling()
	.accessDeniedPage("/denied");
}
}
