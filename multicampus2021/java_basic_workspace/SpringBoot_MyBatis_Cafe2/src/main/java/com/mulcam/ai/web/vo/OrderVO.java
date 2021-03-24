package com.mulcam.ai.web.vo;

import java.util.Date;

public class OrderVO {

	private String ordermethod, product_name;
	private Long order_group_no,quantity;
	private Date orderdate;
	public String getOrdermethod() {
		return ordermethod;
	}
	public void setOrdermethod(String ordermethod) {
		this.ordermethod = ordermethod;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Long getOrder_group_no() {
		return order_group_no;
	}
	public void setOrder_group_no(Long order_group_no) {
		this.order_group_no = order_group_no;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public OrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderVO(String ordermethod, String product_name, Long order_group_no, Long quantity, Date orderdate) {
		super();
		this.ordermethod = ordermethod;
		this.product_name = product_name;
		this.order_group_no = order_group_no;
		this.quantity = quantity;
		this.orderdate = orderdate;
	}
	public OrderVO(String ordermethod, String prodname, long quantity) {
		
		this.ordermethod = ordermethod;
		this.product_name = prodname;
		this.quantity = quantity;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
