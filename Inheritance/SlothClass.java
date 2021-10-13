package Inheritance;

public class SlothClass extends AnimalClass{

		// Attributes
		private String breed;
		
		public SlothClass (String name, int age, String specie, String food, String breed) {
		super (name, age, specie, food);
		this.breed = breed;
		
		}
		
		public void print() {
			System.out.print("BICHO-PREGUIÇA");
			System.out.print("\n Nome: "+getName());
			System.out.print("\n Idade: "+getAge());
			System.out.print("\n Espécie: "+getSpecie());
			System.out.print("\n Alimentação: "+getFood());
			System.out.print("\n Raça: "+breed);
		}
		public void sound() {
			System.out.print("\n O bicho-preguiça começa a emitir um som: ");
			int i;
			for (i = 3; i >= 1; i--){
				System.out.print("\n "+i);
				try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
			System.out.print("\n AAAAAAHHHHhhhhhhhhzzzzzZZZZZZZ!!!");
		}
		public void climb() {
			System.out.print("\n O bixo-preguiça lentamente sobiu à arvore");
		}
		
		public String getBreed() {
			return breed;
		}
		
		public void setBreed(String breed) {
			this.breed = breed;
	}

}

