package com.cqjy.entity;

/**
 * 电脑实体类
 * @author CQJY
 *
 */
public class Computer {

	//注入USB接口
	private USB usb;

	public void setUsb(USB usb) {
		this.usb = usb;
	}
	
	public void work() {
		System.out.println("正在使用"+usb.showMe()+"接口");
	}
	
}
