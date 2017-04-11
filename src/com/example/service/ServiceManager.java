package com.example.service;

import com.example.hotupdate.HotUpdateInstance;

public class ServiceManager implements Service,HotUpdateInstance{

	@Override
	public void sayHello() {
		System.out.println("ServiceManager sayHello222222222===============");
	}
}
