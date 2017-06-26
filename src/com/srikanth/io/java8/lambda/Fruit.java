package com.srikanth.io.java8.lambda;

public class Fruit implements Comparable<Fruit>{
	private String name;
	private String taste;
	private double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Fruit(String name, String taste, double weight) {
		super();
		this.name = name;
		this.taste = taste;
		this.weight = weight;
	}
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String("Fruit Name: "+this.name+" Taste: "+this.taste+" Weight: "+this.weight);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (taste == null) {
			if (other.taste != null)
				return false;
		} else if (!taste.equals(other.taste))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Fruit f) {		
		if(this.weight< f.weight)
			return -1;
		else if(this.weight > f.weight)
			return 1;
		else
		return 0;
	}
	
	public void print(){
		System.out.println("Fruit Name: "+this.name+" Taste: "+this.taste+" Weight: "+this.weight);
	}
	
}
