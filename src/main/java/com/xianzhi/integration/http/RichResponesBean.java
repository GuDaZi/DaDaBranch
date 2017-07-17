package com.xianzhi.integration.http;


import com.xianzhi.integration.model.base.BaseResponesBean;

public class RichResponesBean<T> extends BaseResponesBean {
	private T content;
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	public RichResponesBean() {
		super();
	}
}
