package cn.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version demo2020-1.0
 * @Title: CsOrderApplication
 * @Description:
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/6/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CsOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsOrderApplication.class,args);
	}

}
