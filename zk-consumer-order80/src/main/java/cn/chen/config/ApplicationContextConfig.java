package cn.chen.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
 * @date: 2020/6/2
 */
@Configuration
public class ApplicationContextConfig {
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
