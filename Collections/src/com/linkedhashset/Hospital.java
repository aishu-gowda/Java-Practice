package com.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Hospital {
LinkedHashSet<Pactient> set = new LinkedHashSet<>();
void add(Pactient p)
{
	set.add(p);
	System.out.println("data added");
}
void remove(int id)
{
	Iterator<Pactient> itr=set.iterator();
	while(itr.hasNext())
	{
		Pactient p = itr.next();
		if(p.pid==id)
		{
			itr.remove();
		}
	}
}
void display()
{
	for(Pactient p:set)
	{
		System.out.println(p);
	}
}
void sort()
{
ArrayList<Pactient> list = new ArrayList<>(set);
{
	Collections.sort(list, new Comparator<Pactient>() {

		
		@Override
		public int compare(Pactient p1, Pactient p2) {
		
			return p1.pname.compareTo(p2.pname);
		}
		
	});
}
}
}
