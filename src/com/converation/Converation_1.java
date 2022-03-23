package com.converation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Converation_1 {

	public static void main(String[] args) {
	
		Object obj=356.56;
		
		String str =obj.toString();//conver object to string
		System.out.println("convert Object to String  "+str);
		
		
		
		String[] name  =new String[] {"vijay","Vignesh"};
		
		
		
		List<String>list =Arrays.asList(name);
		
		System.out.println("convert arrray to list"+list);
		
		
	}
	
	
	
	
	
	
}
