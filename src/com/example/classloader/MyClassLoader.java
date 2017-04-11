package com.example.classloader;

public class MyClassLoader extends ClassLoader{

	public MyClassLoader(){
		super(Thread.currentThread().getContextClassLoader());
	}
	public Class<?> findClass(byte[] b) throws ClassNotFoundException {
		return defineClass(null,b,0,b.length);
	}
}
