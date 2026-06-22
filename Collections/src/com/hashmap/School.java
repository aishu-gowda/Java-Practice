package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class School {
 HashMap<Integer,Student> map = new HashMap<>();
 
 void add(int code,Student s)
 {
	 map.put(code, s);
	 System.out.println("elements added");
 }
 
 void remove(int code)
 {
	 
		Iterator<Map.Entry<Integer,Student>> itr=map.entrySet().iterator();
				{
			      while(itr.hasNext())
			      {
			    	  Map.Entry<Integer,Student> entry = itr.next();
			    	  System.out.println(entry.getKey());
			    	  if(entry.getKey()== code)
			    	  {
			    		  itr.remove();
			    		  System.out.println("element removed");
			    	  }
			      }
				}
				
				

 }
 
 void search(String name)
 {
	 for(Map.Entry<Integer,Student> entry:map.entrySet())
	 {
		 if(entry.getValue().name.equalsIgnoreCase(name))
				 {
			        System.out.println(entry.getValue()+" : element found");
				 }
		 
	 }
 }
 
 void display()
 {
	 for(Map.Entry<Integer,Student> entry: map.entrySet())
	 {
		 System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
	 }
 }
 
 void update(int code,Student s1)
 {
	 for(Map.Entry<Integer,Student> entry:map.entrySet())
	 {
		 if(entry.getKey()==code)
		 {
			map.put(code, s1);
			 System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
		 }
	 }
	 }
}
