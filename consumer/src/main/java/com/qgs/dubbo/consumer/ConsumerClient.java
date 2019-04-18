package com.qgs.dubbo.consumer;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qgs.dubbo.provider.ServiceAPI;

public class ConsumerClient {

	public static void main(String args[]){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
		
		context.start();
		
		while(true){
			
			Scanner s = new Scanner(System.in);
			String message = s.next();
			
			ServiceAPI serviceAPI = (ServiceAPI)context.getBean("consumerService");
			System.out.println(serviceAPI.sendMsg(message));
		}
	}
}
