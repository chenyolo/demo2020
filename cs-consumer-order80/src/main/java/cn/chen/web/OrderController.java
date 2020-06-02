package cn.chen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version demo2020-1.0
 * @Title: OrderController
 * @Description:
 * @Company:
 * @package: cn.chen.web
 * @author: chenlf
 * @date: 2020/6/2
 */
@RestController
public class OrderController {

	@Value("${cs.server.url}")
	private String csUrl;

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/consul")
	public String payment() {
		String result = restTemplate.getForObject(csUrl + "/payment/consul", String.class);
		return result;

	}
}
