package org.zerock.b01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CustomServletConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry register) {
        register.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/js/");
        register.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/static/fonts/");
        register.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/css/");
        register.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/static/assets/");

    }
}
