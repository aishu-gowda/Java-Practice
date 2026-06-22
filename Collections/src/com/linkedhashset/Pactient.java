package com.linkedhashset;

import java.util.Objects;

public class Pactient {
int pid;
String pname;
public Pactient(int pid, String pname) {
	super();
	this.pid = pid;
	this.pname = pname;
}

public String toString()
{
	return pid+" "+pname;
	
}
@override
public int hashCode()
{
	return Objects.hash(pid);
}

public boolean equals(Object obj)
{   
	if(this==obj)
	{
		return true;
	}
	if(obj==null||getClass() != obj.getClass())
	{
		return false;
	}
	 
	Pactient other = (Pactient) obj;
	
	return this.pid==other.pid;
}
}
