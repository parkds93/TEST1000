package com.eqm.project.configurarion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
//WebSecurity ConfigurationAdapter를 상속받는 클래스에 이 어노테이션을 선언하면 SpringSecurity filterChain이 자동으로 포함 
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	//http요청에 대한 보안설정
	@Override
	protected void configure(HttpSecurity http) throws Exception{
			http.formLogin()
									   .loginPage("/member/loginView")//로그인을 해야할 페이지를 설정
									   .defaultSuccessUrl("/")//로그인 성공시 이동할 페이지
									   .usernameParameter("userId")//id값으로 받을 파라미터 명
									   .failureUrl("/user/login/error")//실패하였을때 이동할경로
									   .and()
									   .logout()
									   .logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
									   .logoutSuccessUrl("/");//로그아웃 후 이동할 페이지


	}
	
	//스프링에서 제공하는 BCryptPasswordEncoder의 해쉬함수를 사용하여 비밀번호 암호화
	@Bean
	public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
	}


	
}
