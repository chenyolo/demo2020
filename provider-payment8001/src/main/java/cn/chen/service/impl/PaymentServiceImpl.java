package cn.chen.service.impl;

import cn.chen.dao.PaymentDao;
import cn.chen.entity.Payment;
import cn.chen.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version demo2020-1.0
 * @Title: PaymentServiceImpl
 * @Description:
 * @Company:
 * @package: cn.chen.service.impl
 * @author: chenlf
 * @date: 2020/5/26 10:55
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao dao;

	@Override
	public int save(Payment payment) {
		return dao.save(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return dao.getPaymentById(id);
	}
}
