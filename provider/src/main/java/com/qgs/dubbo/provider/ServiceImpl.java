package com.qgs.dubbo.provider;

public class ServiceImpl implements ServiceAPI{

	public String sendMsg(String msg) {
		System.out.println("provider recv:" + msg);
		return "provider recv:" + msg;
	}

}
