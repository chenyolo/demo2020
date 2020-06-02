package cn.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version demo2020-1.0
 * @Title: ZkPayment8003
 * @Description:
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/5/28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkPayment8003 {
	public static void main(String[] args) {
		SpringApplication.run(ZkPayment8003.class, args);
	}
}
