package cn.chen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version demo2020-1.0
 * @Title: ZkOrderController
 * @Description:
 * @Company:
 * @package: cn.chen.web
 * @author: chenlf
 * @date: 2020/6/2
 */
@RestController
public class ZkOrderController {

	@Value("${zk.server.url}")
	private String zkUrl;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/zk")
	public String payment (){
		String result = restTemplate.getForObject(zkUrl+"/payment/zk/test",String.class);
		return result;
	}

}

