package POO;

public class Employee1 extends Person{
	
	private int codeSector;
	private float baseSalary;
	private float tax;
	
	public Employee1(String name, String address, String cpf, int phone, int age, int codeSector, float baseSalary, float tax)
	{
		super(name, address, cpf, phone, age);
		this.codeSector = codeSector;
		this.baseSalary = baseSalary;
		this.tax = tax;
	}
	public void printInfo()
	{
		System.out.println("\nNome do Empregado: "+getName()+"\nCPF: "+getCpf()+"\nIdade: "+getAge()+"\nEndereço: "+getAddress()+"\nTelefone: "+getPhone()+
				"\nCódigo do setor: "+codeSector+"\nSalario Base: "+baseSalary+"\nValor em porcentagem(sem %) de imposto a ser retido do salário: "+tax);
	}
	
	public void calculateSalary()
	{
		double total_salary = baseSalary - (baseSalary * (tax/100));
		System.out.println("\nO Valor total a receber pelo empregado: "+getName()+
		"é igual a: "+total_salary);
	}
	
	public int getCodeSector()
	{
		return codeSector;
	}
	public void setCodeSector(int codeSector)
	{
		this.codeSector = codeSector;
	}
	public float setBaseSalary()
	{
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary)
	{
		this.baseSalary = baseSalary;
	}
	public float getTax()
	{
		return tax;
	}
	public void setTax(float tax)
	{
		this.tax = tax;
	}
}
