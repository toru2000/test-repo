package com.jdc.toru.custom;

@SuppressWarnings("serial")
public class MyUnCheckException extends RuntimeException{
	
	//message ma pr tae default constructor
		public MyUnCheckException() {
			super();
		}
		
		public MyUnCheckException(String message) {
			super(message);
		}
}
