package POO;

public class Person {

	//atributos
	private String name;
	private String address;
	private String cpf;
	private int phone;
	private int age;
	
	public Person (String name, String address, String cpf, int phone, int age)
	{
		super();
		this.name = name;
		this.address = address;
		this.cpf = cpf;
		this.phone = phone;
		this.age = age;
	}
	public Person(String name, String address, String cpf)
	{
		this.name = name;
		this.address = address;
		this.cpf = cpf;
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("\n--CPF Inválido!!!");
		}
		else
		{
			System.out.println("\n--CPF Inválido!!!");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
