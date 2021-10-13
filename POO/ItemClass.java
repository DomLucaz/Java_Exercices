package POO;

import java.text.NumberFormat;

/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe,
em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente 
as informações deste objeto no console*/

public class ItemClass {

		//Attributes
		private String nameItem;
		private double valueItem;
		private String brandItem;
		private String info;
		
		//Constructor
		
		public ItemClass (String nameItem, String brandItem, String info, double valueItem) {
		
		this.info=info;
		this.brandItem = brandItem;
		this.nameItem = nameItem;
		this.valueItem = valueItem;
		}
		//Getters and Setters

		public String getNameItem() {
			return nameItem;
		}

		public void setNameItem(String nameItem) {
			this.nameItem = nameItem;
		}

		public double getValueItem() {
			return valueItem;
		}

		public void setValueItem(double valueItem) {
			this.valueItem = valueItem;
		}

		public String getBrandItem() {
			return brandItem;
		}

		public void setBrandItem(String brandItem) {
			this.brandItem = brandItem;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
		public String price() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumIntegerDigits(2);
			String value = nf.format(valueItem);
			return value;
		}
		public void prinfInfo() {
			System.out.println("\nProduto: " +nameItem
				+" Marca: "+brandItem
				+" Informação: "+info
				+"Preço:"+this.price());	
		}
		
}
