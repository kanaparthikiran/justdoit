/**
 * 
 */
package com.hotel.api;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author kkanaparthi
 * @param <V>
 *
 */
public class Pair extends HashMap<String, ArrayList<Object>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8306415824580994371L;
	/**
	 * @return the key
	 */
	public Object getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(Object key) {
		this.key = key;
	}
	public Pair(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	private Object key;
	private Object value;
	
}
