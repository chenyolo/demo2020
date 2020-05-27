package cn.chen.dao;

import cn.chen.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version demo2020-1.0
 * @Title: PaymentDao
 * @Description:
 * @Company:
 * @package: cn.chen.dao
 * @author: chenlf
 * @date: 2020/5/26 10:49
 */
@Mapper
public interface PaymentDao {
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
