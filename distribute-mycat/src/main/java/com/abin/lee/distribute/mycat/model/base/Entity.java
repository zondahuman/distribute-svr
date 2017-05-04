package com.abin.lee.distribute.mycat.model.base;

import java.io.Serializable;



public interface Entity extends Serializable {

	public abstract void setId(Integer id);
	
	public abstract Integer getId();
	
	public void setPropValue(String propName, Object value);
	
	public Object getPropValue(String propName);
	
	
}
