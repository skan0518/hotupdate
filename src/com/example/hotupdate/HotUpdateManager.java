package com.example.hotupdate;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import com.example.classloader.MyClassLoader;

public class HotUpdateManager {
	/**通过反射执行reload方法*/
	public static boolean hotUpdateClass(String classname){
		try {
			Class c = Class.forName(classname);
			if(c!=null){
				Object o = c.newInstance();
				Method m = c.getMethod("reload");
				m.invoke(o);
				return true;
			}
			System.out.println("==========no fond class===========");
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Class loadClass(String name) throws ClassNotFoundException{
		MyClassLoader loader = new MyClassLoader();
		String path = "./class/"+name+".class";
		System.out.println("loadClass path==============="+path);
		byte data[] = getBytes(path);
		if(data !=null && data.length>0){
			Class nc = loader.findClass(data);
			return nc;
		}
		System.out.println("null===================");
		return null;
	}
	public static byte[] getBytes(String path){
		File file = new File(path);
		long len = file.length();
		byte raw[] = new byte[(int)len];
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(path);
			int r = fin.read(raw);
			if(r!=len){
				return null;
			}
			return raw;
		} catch (Exception e) {
			
		}finally{
			try{
				if(fin!=null){
					fin.close();
				}
			}catch(Exception e){
				
			}
			
		}
		return null;
	}
}
