package com.app;

public class CustomerPair <K,V> implements Pair <K,V> {

	private K key; 
	private V Value;
	
	public CustomerPair(K key, V Value) {
		super();
		this.key = key;
		this.Value = Value;
		
	}
		
		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return key;
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return Value;
	}
}
