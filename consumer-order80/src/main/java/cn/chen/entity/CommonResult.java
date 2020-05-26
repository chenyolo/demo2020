package cn.chen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version demo2020-1.0
 * @Title: CommonResult
 * @Description: 通用Json结果
 * @Company:
 * @package: cn.chen.entity
 * @author: chenlf
 * @date: 2020/5/26 10:46R
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
	/**
	 * 返回状态码
	 */
	private int code;

	/**
	 * 返回信息
	 */
	private String message;

	/**
	 * 返回结果集
	 */
	private T data;

	public CommonResult(int code, String message){
		this(code,message,null);
	}
}
