package Inheritance;

public class DogClass extends AnimalClass{

		// Attributes
		private String breed;
		
		public DogClass (String name, int age, String specie, String food, String breed) {
		super (name, age, specie, food);
		this.breed = breed;
		
		}
		
		public void print() {
			System.out.print("CACHORRO");
			System.out.print("\n Nome: "+getName());
			System.out.print("\n Idade: "+getAge());
			System.out.print("\n Espécie: "+getSpecie());
			System.out.print("\n Alimentação: "+getFood());
			System.out.print("\n Raça: "+breed);
		}
		public void sound() {
			System.out.print("\n O cachorro começa a emitir um som: ");
			int i;
			for (i = 3; i >= 1; i--){
				System.out.print("\n "+i);
				try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
			System.out.print("\n Au Au Au!!!");
		}
		public void run() {
			System.out.print("\n O cachorro começou a correr!!!");
		}
	
		public String getBreed() {
			return breed;
		}
	
		public void setBreed(String breed) {
			this.breed = breed;
	}
	
}
