package com.velpe.yoon.sfarm.global.config;

import com.velpe.yoon.sfarm.domain.member.application.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final MemberService memberService;


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests(
                
                authorize -> authorize
                    .mvcMatchers(
                            "/"
                    ).permitAll()
        );
              // .formLogin()
              //  .loginPage("/member") // 로그인 정보 입력 show
              // .loginProcessingUrl("/member/") // do
    }

    // 비밀번호 암호화
    @Bean
    public PasswordEncoder passwordEncode(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       // auth.userDetailsService(memberService).passwordEncoder(passwordEncode());
    }
}
