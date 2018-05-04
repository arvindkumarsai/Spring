package com.arvind.spring.springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
@Configuration
public class AppConfig extends WebSecurityConfigurerAdapter { 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//if authentication is not required and permission is given to all users and roles
		//	http.authorizeRequests().anyRequest().permitAll().and().httpBasic();
		//	http.csrf().disable();
		//Matchers("/").access("hasRole('USER')").and().formLogin();
		
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		http.csrf().disable();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("password").roles("USER");
	}
	
	/*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }*/

	
	
/*	
	If you are only wanting a custom method expression handler to provide a permission evaluator, then you only need to create a PermissionEvaluator bean like this:
		@Configuration
		@EnableGlobalMethodSecurity(prePostEnabled = true)
		public class MethodSecurityConfig {
		    @Autowired
		    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		        auth
		            .inMemoryAuthentication()
		                .withUser("user").password("password").roles("USER");
		    }
		    @Bean
		    public PermissionEvaluator permissionEvaluator() {
		        // ... create and return custom PermissionEvaluator ...
		        return permissionEvaluator;
		    }
		}*/
	
	

}
