package com.qgs.dubbo.provider;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderClient {

	public static void main(String args[]){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-provider.xml");
		
		context.start();
		while(true){
			Scanner s = new Scanner(System.in);
		}
		
	}
}
