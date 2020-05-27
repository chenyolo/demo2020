package cn.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version demo2020-1.0
 * @Title: EurekaApplication7001
 * @Description:
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/5/27
 */
@SpringBootApplication
@EnableEurekaServer //服务端：注册中心
public class EurekaApplication7001 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication7001.class,args);
	}
}
