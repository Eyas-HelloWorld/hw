package com.cqjy.entity;

/**
 * 打印机
 * @author CQJY
 *
 */
public class Printer {

	//============依赖注入墨盒和纸张
	private InkBox inkBox;
	private Paper paper;
	
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print() {
		System.out.println("在"+paper.showSize()+"的纸张上打印"+inkBox.showColor()+"内容");
	}
}
