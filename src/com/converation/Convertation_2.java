package com.converation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convertation_2 {
	public static void main(String[] args) {
	
		
   String b[] = {"vijay","vikey"};
  
  	   
   List<String>list =Arrays.asList(b);//convert Array to list
   
   System.out.println("convert Array to List"+list);
      
    
   List<Object>a = new ArrayList<>();
   
   a.add(9);
   a.add(89);
   a.add(89);
   System.out.println(a);
   
   Set<Object>set = new HashSet<Object>(a);//convert list to set
   System.out.println("convert list to Set"+set);
   List<Object>li = new ArrayList<>(set);// set to list
   li.add(89);
   System.out.println("convert set to list"+li);
   
	}

	
	

}