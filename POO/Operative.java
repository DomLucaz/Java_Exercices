package POO;

public class Operative extends Person {

	private double productionValue;
	private double comission;
	
	public Operative(String name, String adress, String cpf,int phone,int age, double productionValue, double comission)
	{
		super(name, adress, cpf, phone, age);
		this.productionValue = productionValue;
		this.comission = comission;
	}
	
	public void printInfo()
	{
		System.out.println("\nNome do oper�rio"+getName()
		+"\nCPF: "+getCpf()
		+"\nIdade: "+getAge()
		+"\nTelefone: "+getPhone()
		+"\nEndere�o: "+getAddress()
		+"\nValor monet�rio dos artigos produzidos: "+productionValue
		+"\nPorcentagem (sem %) da comiss�o deste artigo: "+comission);
	}
	public void calculateArticleValue()
	{
		double total_value = productionValue + (productionValue * (comission/100));
		System.out.println("\nO valor total a ser recebido pelo oper�rio: "+getName()
		+"� igual a: "+total_value);
	}

	public double getProductionValue() {
		return productionValue;
	}

	public void setProductionValue(double productionValue) {
		this.productionValue = productionValue;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}
	
}
