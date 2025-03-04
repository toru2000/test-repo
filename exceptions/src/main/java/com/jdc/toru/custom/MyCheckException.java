package com.jdc.toru.custom;

@SuppressWarnings("serial")
public class MyCheckException extends Exception{  //myException class ka extends lote lite tr nae exception obj change twr tal
	
	//message ma pr tae default constructor
	public MyCheckException() {
		super();
	}
	
	//message pr tae default constructor
	public MyCheckException(String message) {
		super(message);
	}
}
