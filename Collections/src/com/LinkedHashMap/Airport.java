package com.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Airport {
	LinkedHashMap<Integer ,Flight> map=new LinkedHashMap<>();
	
	public void add(int id,Flight f)
	{
		map.put(id, f);
	}
	public void display()
	{
		for(Map.Entry<Integer,Flight> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public void compare()
	{
		for(Map.Entry<Integer,Flight> entry:map.entrySet())
		{
			if((entry.getValue().dest.equals("Banglore")) && (entry.getValue().source.equals("Maldivs")))
			{
				System.out.println(entry.getValue());
			}
		}
	}
	public void remove(String so) {
		Iterator<Map.Entry<Integer,Flight>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,Flight> e=it.next();
			if(e.getValue().source.equals(so)) {
				System.out.println("removed");
				it.remove();
			}
		}
	}
}
