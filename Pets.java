package PetsProblem;

abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks on "+legs+" legs");
	}
}
class Spider extends Animal{
	public Spider(){
		super(8);
	}
	@Override
	public void eat() {
		System.out.println("Spider eat insects ");
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
		System.out.println("Cat eat fishes");
	}
	public String getName() {

		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("The cat is Playing");
	}
}
class Fish extends Animal implements Pet{
	private String name;
	protected Fish(String name) {
		
		super(0);
	}
	Fish(){
		this("");
	}
	String food;
	@Override
	public void eat() {
		System.out.println(" Fish  eat plants");
	}
	public String getName() {

		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("The Fish is Playing");
	}
	@Override
	public void walk() {
		System.out.println("Fish can't walk");
	}
}
public class problem1 {
	public static void main(String [] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        System.out.println("FISH");
        d.setName("Mimi");
        System.out.println("This fish's name is "+d.getName());
        d.eat();
        d.walk();
        d.setName("Momo");
        System.out.println("This fish's name is "+d.getName());
        System.out.println("\n");
        System.out.println("CAT");
        System.out.println("This cats's name is "+c.getName());
        c.walk();
        c.eat();
        c.setName("Moose");
      
        System.out.println("This cat's name is "+c.getName());
        System.out.println("\n");
        System.out.println("SPIDER");
        e.eat();
        e.walk();
	}
}
