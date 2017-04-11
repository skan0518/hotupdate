package com.example.main;

import com.example.hotupdate.HotUpdateManager;
import com.example.service.Service;
import com.example.service.ServiceProxy;

public class Main {

	public static void main(String[] args) {
		if(HotUpdateManager.hotUpdateClass("com.example.service.ServiceProxy")){
			System.out.println("�ȸ��³ɹ�====================");
		}else{
			System.out.println("�ȸ���ʧ��====================");
		}
		ProxyTest();

	}
	public static void ProxyTest(){
		Service service = ServiceProxy.getServiceProxy();
		service.sayHello();	
	}
}
