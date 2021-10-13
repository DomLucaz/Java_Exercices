package POO;

/* 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.*/

public class AirplaneClass {
	//Attributes
	private String maker;
	private String brand;
	private String colour;
	private int seat_total;
	private boolean status;
	
	public AirplaneClass(String maker, String brand, String colour, int seat_total)
	{
		this.maker = maker;
		this.brand = brand;
		this.colour = colour;
		this.seat_total = seat_total;
		this.status = false;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSeat_total() {
		return seat_total;
	}

	public void setSeat_total(int seat_total) {
		this.seat_total = seat_total;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public void statusGarage()
	{
		this.status = false;
	}
	public void statusFlying()
	{
		this.status = true;
	}
	public String consultStatus()
	{
		if(status)
			return "Em vooo - Indisponível";
		else
			return "Na garagem - Disponível";
	}
	public void printInfo()
	{
		System.out.println("*****************\nFabricante: "+maker
		+"\nModelo: "+brand
		+"\nCor: "+colour
		+"\nTotal de assentos: "+seat_total
		+"\nDisponibilidade"+consultStatus());
	}
	
}
