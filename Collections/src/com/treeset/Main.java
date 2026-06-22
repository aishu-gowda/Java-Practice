package com.treeset;

public class Main {
public static void main(String[] args) {
	Ladies_PG pg = new Ladies_PG();
	pg.add(new Ladies(12,"aishu",4000));
	pg.add(new Ladies(32,"sweety",4750));
	pg.add(new Ladies(420,"pavi",200));
	pg.add(new Ladies(12,"vaishu",2500));
	
	pg.display();
}
}
