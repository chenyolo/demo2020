package cn.chen.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @version demo2020-1.0
 * @Title: PaymentController
 * @Description:
 * @Company:
 * @package: cn.chen.web
 * @author: chenlf
 * @date: 2020/6/2
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/consul")
	public String paymentConsul(){
		return "consul port: "+serverPort+"\t"+ UUID.randomUUID().toString();
	}

}
