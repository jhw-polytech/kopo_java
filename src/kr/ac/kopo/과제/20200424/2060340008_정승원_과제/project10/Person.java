package kr.ac.kopo.day10.project.project10;

abstract class Person {
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void print();
}
