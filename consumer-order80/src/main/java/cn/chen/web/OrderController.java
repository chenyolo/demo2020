package cn.chen.web;

import cn.chen.entity.CommonResult;
import cn.chen.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version demo2020-1.0
 * @Title: OrderController
 * @Description:
 * @Company:
 * @package: cn.chen.web
 * @author: chenlf
 * @date: 2020/5/26 17:07
 */
@RestController
@Slf4j
@RequestMapping("consumer")
public class OrderController {

	/*@Value("${payment.url}")
	private String paymentUrl;*/
	//public static final String PAYMENT_URL = "http://localhost:8001";
	@Value("${payment.server.name}")
	private String paymentServerName;

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/payment/save")
	public CommonResult<Payment> save(@RequestBody Payment payment){
		return restTemplate.postForObject(paymentServerName+"/payment/save", payment, CommonResult.class);  //写操作
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
		return restTemplate.getForObject(paymentServerName+"/payment/get/"+id, CommonResult.class);
	}

}
