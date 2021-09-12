package com.example.fruitapp;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(101, "Citrus", 1500);
		fl.add(s2);
		Fruit s3 = new Fruit(101, "Mango", 3000);
		fl.add(s3);
		Fruit s4 = new Fruit(101, "Pineapple", 5000);
		fl.add(s4);
		Fruit s5 = new Fruit(101, "Banana", 2000);
		fl.add(s5);
		Fruit s6 = new Fruit(101, "Watermelon", 8000);
		fl.add(s6);
		Fruit s7 = new Fruit(101, "Melon", 8000);
		fl.add(s7);
		Fruit s8 = new Fruit(101, "Dragonfruit", 7000);
		fl.add(s8);
		Fruit s9 = new Fruit(101, "Pear", 2000);
		fl.add(s9);
		Fruit s0 = new Fruit(101, "Plum", 1000);
		fl.add(s0);
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}

		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
