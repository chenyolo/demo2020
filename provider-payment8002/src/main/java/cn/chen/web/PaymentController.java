package cn.chen.web;

import cn.chen.entity.CommonResult;
import cn.chen.entity.Payment;
import cn.chen.entity.ResultCode;
import cn.chen.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @version demo2020-1.0
 * @Title: PaymentController
 * @Description:
 * @Company:
 * @package: cn.chen.web
 * @author: chenlf
 * @date: 2020/5/26 10:58
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;


	@PostMapping("/save")
	public CommonResult<Payment> save(Payment payment){
		int result = paymentService.save(payment);
		if (result>0)
			return new CommonResult<Payment>(ResultCode.CODE_SUCCESS,"保存成功!serverPort:"+serverPort);
		else
			return new CommonResult<Payment>(ResultCode.CODE_FAILED,"保存失败");
	}

	@GetMapping("get/{id}")
	public CommonResult<Payment> getById(@PathVariable ("id") Long id){
		Payment payment = paymentService.getPaymentById(id);
		if (payment != null)
			return new CommonResult<Payment>(ResultCode.CODE_SUCCESS,"查询成功!serverPort:"+serverPort, payment);
		else
			return new CommonResult<Payment>(ResultCode.CODE_FAILED,"查询无结果");
	}

}
