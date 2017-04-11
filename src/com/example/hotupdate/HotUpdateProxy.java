package com.example.hotupdate;

public abstract class HotUpdateProxy {
	public abstract void setHotUpdateInstance(HotUpdateInstance instance);
	public abstract String getClassName();
	public boolean reload(){
		try {
			Class c = HotUpdateManager.loadClass(getClassName());
			if(c==null){
				System.out.println("reload false==============");
				return false;
			}
			HotUpdateInstance o = (HotUpdateInstance) c.newInstance();
			setHotUpdateInstance(o);
			return true;
		} catch (Exception e) {
		}
		return false;
	}
}
