package cn.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version demo2020-1.0
 * @Title: ZkOrderApplication
 * @Description:
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/6/2
 */
@SpringBootApplication
@EnableDiscoveryClient //服务发现
public class ZkOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZkOrderApplication.class,args);
	}
}
