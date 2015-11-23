package com.spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.spring")
@EnableWebMvc
public class AppConfig {

	@Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        // ��������� ��� ����� ������ ���� ���-��������
        resolver.setPrefix("/WEB-INF/jsp/");
        // ������ View ������� �� ����� ������������
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
 
        return resolver;
    }
}
