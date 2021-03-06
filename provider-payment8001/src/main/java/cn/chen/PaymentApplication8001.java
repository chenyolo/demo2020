package cn.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version demo2020-1.0
 * @Title: PaymentApplication
 * @Description: 主启动类
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/5/26 9:50
 */
@SpringBootApplication
@EnableEurekaClient // 客户端
@EnableDiscoveryClient //服务发现
public class PaymentApplication8001 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication8001.class, args);
	}
}
