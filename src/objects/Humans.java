package objects;

public class Humans {

	String name;
	int age;
	int height;
	String eyeColor;
	
	public Humans() {
		
	}
	
	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My height is " + height);
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void walt() {
		System.out.println("Walking");
	} 
	
	public void work() {
		System.out.println("working");
	}
	
}