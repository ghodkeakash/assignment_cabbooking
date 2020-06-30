package com.assignment.cabbooking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
public class CabbookingApplication extends WebMvcConfigurerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(CabbookingApplication.class);

	public static void main(String[] args) {
		logger.info("STARTED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		SpringApplication.run(CabbookingApplication.class, args);
		logger.info("STARTED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

	  // registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
