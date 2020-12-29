package com.bubba.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bubba.service.HelloService;

/**
 * 
 * @author bubba
 * 配置类
 * Before: bean.xml
 * After: @Configuraion
 *
 */
@Configuration
public class MyApp {
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
