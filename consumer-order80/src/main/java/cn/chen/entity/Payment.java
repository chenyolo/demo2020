package cn.chen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version demo2020-1.0
 * @Title: Payment
 * @Description:
 * @Company:
 * @package: cn.chen.entity
 * @author: chenlf
 * @date: 2020/5/26 9:53
 */
@Data //get\set
@AllArgsConstructor //全参构造
@NoArgsConstructor //无参构造
public class Payment implements Serializable{

	private Long id;

	private String serial;
}
