package Polymorphism1;

public class SlothClass extends AnimalClass{

		// Attributes
		private String breed;
		
		public SlothClass (String name, int age, String specie, String food, String breed) {
		super (name, age, specie, food);
		this.breed = breed;
		
		}
		@Override
		public void print() {
			System.out.print("BICHO-PREGUI?A");
			System.out.print("\n Nome: "+getName());
			System.out.print("\n Idade: "+getAge());
			System.out.print("\n Esp?cie: "+getSpecie());
			System.out.print("\n Alimenta??o: "+getFood());
			System.out.print("\n Ra?a: "+breed);
		}
		@Override
		public void sound(String sound) {
			System.out.print("\n O bicho-pregui?a come?a a emitir um som: ");
			int i;
			for (i = 3; i >= 1; i--){
				System.out.print("\n "+i);
				try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
			System.out.print("\n AAAAAAHHHHhhhhhhhhzzzzzZZZZZZZ!!!");
		}
		public void climb() {
			System.out.print("\n O bixo-pregui?a lentamente sobiu ? arvore");
		}
		
		public String getBreed() {
			return breed;
		}
		
		public void setBreed(String breed) {
			this.breed = breed;
	}
		@Override
		public void run(String run) {
			// TODO Auto-generated method stub
			
		}

}

