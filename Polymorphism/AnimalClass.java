package Polymorphism1;

public abstract class AnimalClass {

	
	// Attributes
	private String name;
	private int age;
	private String specie;
	private String food;
	
	// Constructor
	public AnimalClass (String name, int age, String specie, String food)
	{
		super();
		this.name = name;
		this.age = age;
		this.specie = specie;
		this.food = food;
	}
	//abstract
	abstract public void sound(String sound);
	abstract public void run(String run);
	
	abstract public void print();
	// Get and Set
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
}
