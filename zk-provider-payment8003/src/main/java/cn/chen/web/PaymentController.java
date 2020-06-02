package cn.chen.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @version demo2020-1.0
 * @Title: PaymentController
 * @Description:
 * @Company:
 * @package: cn.chen
 * @author: chenlf
 * @date: 2020/5/28
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping("/zk/test")
	public String test(){
		return "zk port:" + serverPort + new Date();
	}
}
