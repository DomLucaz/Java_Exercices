package Inheritance;

public class HorseClass extends AnimalClass{

		// Attributes
		private String breed;
		
		public HorseClass (String name, int age, String specie, String food, String breed) {
		super (name, age, specie, food);
		this.breed = breed;
		
		}
		
		public void print() {
			System.out.print("CAVALO");
			System.out.print("\n Nome: "+getName());
			System.out.print("\n Idade: "+getAge());
			System.out.print("\n Espécie: "+getSpecie());
			System.out.print("\n Alimentação: "+getFood());
			System.out.print("\n Raça: "+breed);
		}
		public void sound() {
			System.out.print("\n O cavalo começa a emitir um som: ");
			int i;
			for (i = 3; i >= 1; i--){
				System.out.print("\n "+i);
				try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
			System.out.print("\n hiiiin hinin hirin!!");
		}
		public void run() {
			System.out.print("\n O cavalo começou a galopar!!!");
		}
		
		public String getBreed() {
			return breed;
		}
		
		public void setBreed(String breed) {
			this.breed = breed;
	}

}
