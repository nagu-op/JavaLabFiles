package trial;

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks on "+legs+"legs");
	}
}
class Spyder extends Animal{
	public Spyder(){
		super(8);
	}
	@Override
	public void eat() {
		System.out.println("The Spider is eating");
	}
}

interface Pet{
	public  String getName();
	public void setName(String name);
	void play();
}
class Cat extends Animal implements Pet{
	private String name;
	protected Cat(String name) {
		
		super(4);
		this.name = name;
		
	}
	public Cat() {
		this("");
	}
	@Override
	public void eat() {
		System.out.println("The Cat is eating");
	}
	public String getName() {
		System.out.println("Enter the name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("hellow");
	}
}
public class trial {

}
