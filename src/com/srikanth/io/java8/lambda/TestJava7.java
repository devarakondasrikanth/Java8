package com.srikanth.io.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestJava7 {

	public static void main(String[] args) {
		//Java7
		List<Fruit> fruitList7 = new ArrayList<Fruit>();
		addFruits(fruitList7);		
		//Iterating through the list and printing each element
		for(Fruit fruit: fruitList7){
			System.out.println(fruit.toString());
		}
		//sorting based on weighted
		System.out.println("*************Printing after sorting Java7 ********************");
		Collections.sort(fruitList7);
		for(Fruit fruit: fruitList7){
			System.out.println(fruit.toString());
		}
		System.out.println("*************Printing after sorting Java7 ********************");
		//create a Map with key as FruitName and value as Fruit Object java 7
		Map<String,Fruit> fruitMap7 = new HashMap<String,Fruit>();		
		for(Fruit fruit: fruitList7){
			fruitMap7.put(fruit.getName(), fruit);
		}
		System.out.println("Number of elements in fruitMap-7 are "+fruitMap7.size());
		//Java8
		System.out.println("************@@@@@@@@@@@@Java8@@@@@@@@@@@@********************");
		List<Fruit> fruitList8 = new ArrayList<Fruit>();
		addFruits(fruitList8);
		//Iterating through the list
		fruitList8.forEach(Fruit::print);
		//sorting based on weighted
		System.out.println("*************Printing after sorting Java8 ********************");
		System.out.println(fruitList8.stream().sorted().collect(Collectors.toList()));	
		Map<String,Fruit> fruitMap8 = fruitList8.stream().collect(Collectors.toMap(Fruit::getName, Fruit->Fruit));
		System.out.println("Number of elements in fruitMap-8 are "+fruitMap8.size());
		//printing all values for map
		fruitMap8.forEach((k,v)->v.print());
	}
	
	
	public static void addFruits(List<Fruit> fruitList){
		fruitList.add(new Fruit("Apple","Sweet",10.00));
		fruitList.add(new Fruit("Banana","Sweet",6.00));
		fruitList.add(new Fruit("Lemon","Sour",8.00));
		fruitList.add(new Fruit("PineApple","Sour",15.00));
		fruitList.add(new Fruit("Watermelon","Sweet",20.00));
		fruitList.add(new Fruit("Strawberry","Sour",4.00));
		fruitList.add(new Fruit("Guva","Sweet",5.00));
		fruitList.add(new Fruit("CusteredApple","Sweet",12.00));
		fruitList.add(new Fruit("Leech","Sweet",6.00));
		fruitList.add(new Fruit("Coconut","Sweet",18.00));
		fruitList.add(new Fruit("Pine","Sour",19.00));
		
	}

}
