package cn.chen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version demo2020-1.0
 * @Title: ApplicationContextConfig
 * @Description:
 * @Company:
 * @package: cn.chen.config
 * @author: chenlf
 * @date: 2020/5/26 17:06
 */
@Configuration
public class ApplicationContextConfig {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
