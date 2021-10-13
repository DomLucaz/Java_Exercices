package POO;

public class ObjectItem {

	public static void main(String[] args) {
		
		ItemClass item1 = new ItemClass("Ferro de solda", "Tramontina", "Equipamento para soldar componentes eletrônicos", 29);
		ItemClass item2 = new ItemClass("Serra Mármore a Seco", "Bosch", "Equipamento para cortes de pedras, pisos, cerâmicas entre outros", 375);
		ItemClass item3 = new ItemClass("Relé programável", "WEG", "Um compacto e versátil CLP-Controlador lógico programável", 1400);
		
		item1.prinfInfo();
		item2.prinfInfo();
		item3.prinfInfo();
	}

}
