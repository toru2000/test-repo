package com.jdc.toru.trycatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrowData {
	
	
	
	public void useMessage(){
		
		try {
			String message = getData();  //getdata() ka checked exception(IOException) yaw
			if(message.isBlank()) {
				//new keyword nae exception a thit sout 
				throw new NoSuchElementException("There is no message!");	//unchacked exception(NoSuchElementException) yaw ko handle lote pee thr phit
			}
			
			System.out.println(message);
		}
		
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		catch (NoSuchElementException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	//when create check type,must be throw that type
	//when create uncheck type,it's all up to you(as you like you can do)
	//when you used throws , it must be same type or super type of you create object
	
	
	@SuppressWarnings("unused")
	private String checkMessage(String message) throws RuntimeException{ //Ioexception ko exception hte throw yin ya (sub ka super si pyint ya)
		
		if(message.isBlank()) {
			throw new NullPointerException("There is no message!");
		}
		return message;	
	}
	
	//dr ka throw tr
	public String getData() throws IOException{ //try catch ma thone pe throw tr
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your message !!!!!!!");
		return br.readLine();
		
	}
}
