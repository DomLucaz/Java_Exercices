package POO;

public class ObjectItem {

	public static void main(String[] args) {
		
		ItemClass item1 = new ItemClass("Ferro de solda", "Tramontina", "Equipamento para soldar componentes eletr�nicos", 29);
		ItemClass item2 = new ItemClass("Serra M�rmore a Seco", "Bosch", "Equipamento para cortes de pedras, pisos, cer�micas entre outros", 375);
		ItemClass item3 = new ItemClass("Rel� program�vel", "WEG", "Um compacto e vers�til CLP-Controlador l�gico program�vel", 1400);
		
		item1.prinfInfo();
		item2.prinfInfo();
		item3.prinfInfo();
	}

}
