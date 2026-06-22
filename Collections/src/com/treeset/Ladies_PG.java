package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Ladies_PG {
TreeSet<Ladies> set = new TreeSet<>(new MyComparator());
   
void add(Ladies l)
{
	set.add(l);
	System.out.println("data added");
}

void display()
{
	for(Ladies l:set)
	{
		System.out.println(l);
	}
}

void remove(int id)
{
	boolean present=false;
	Iterator<Ladies> itr = set.iterator();
	while(itr.hasNext())
	{
		Ladies l = itr.next();
		if(l.lid==id)
		{
			present=true;
			System.out.println("removed "+l);
		}
	}
	if(!present)
	{
		System.out.println("element not found");
	}
}
}
