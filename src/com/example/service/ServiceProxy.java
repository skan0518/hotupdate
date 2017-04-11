package com.example.service;

import com.example.hotupdate.HotUpdateInstance;
import com.example.hotupdate.HotUpdateProxy;

public class ServiceProxy extends HotUpdateProxy{
	public static HotUpdateInstance service;
	public static Service getServiceProxy(){
		if(service==null){
			service= new ServiceManager();
		}
		return (Service) service;
	}
	@Override
	public  void setHotUpdateInstance(HotUpdateInstance serviceManager){
		ServiceProxy.service=serviceManager;
	}
	@Override
	public String getClassName() {
		return "ServiceManager";
	}
}
