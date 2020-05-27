package cn.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version demo2020-1.0
 * @Title: EurekaApplication7002
 * @Description:
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/5/27
 */
@SpringBootApplication
@EnableEurekaServer //服务端：注册中心
public class EurekaApplication7002 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication7002.class,args);
	}
}
