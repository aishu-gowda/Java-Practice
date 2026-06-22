package com.linkedhashset;

import com.linkedlist.main;

public class Main {
public static void main(String[] args) {
	Hospital h= new Hospital();
	
	h.add(new Pactient(2,"kippi"));
	h.add(new Pactient(1,"manju"));
	h.add(new Pactient(2,"sonu"));
	h.add(new Pactient(4,"shilpa"));
	h.add(new Pactient(3,"amuku-dumuka"));
	
	h.display();
	
	h.remove(4);
	h.display();
}
}
