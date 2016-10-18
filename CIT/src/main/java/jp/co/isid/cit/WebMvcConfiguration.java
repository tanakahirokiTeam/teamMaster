package jp.co.isid.cit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{

@Bean
AppLogger appLogger(){
	return new AppLogger();
}

@Bean
DbLogger dbLogger(){
	return new DbLogger();
}

@Override
public void addInterceptors(InterceptorRegistry registry){
	registry.addInterceptor(appLogger()).addPathPatterns("/**");
}
}

