package com.example.main;

import com.example.hotupdate.HotUpdateManager;
import com.example.service.Service;
import com.example.service.ServiceProxy;

public class Main {

	public static void main(String[] args) {
		if(HotUpdateManager.hotUpdateClass("com.example.service.ServiceProxy")){
			System.out.println("热更新成功====================");
		}else{
			System.out.println("热更新失败====================");
		}
		ProxyTest();

	}
	public static void ProxyTest(){
		Service service = ServiceProxy.getServiceProxy();
		service.sayHello();	
	}
}
