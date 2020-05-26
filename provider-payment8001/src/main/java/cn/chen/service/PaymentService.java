package cn.chen.service;

import cn.chen.entity.Payment;

/**
 * @version demo2020-1.0
 * @Title: PaymentService
 * @Description:
 * @Company:
 * @package: cn.chen.service
 * @author: chenlf
 * @date: 2020/5/26 10:55
 */
public interface PaymentService {
	/**
	 * 保存
	 * @param payment
	 * @return
	 */
	public int save(Payment payment);


	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public Payment getPaymentById(Long id);
}
