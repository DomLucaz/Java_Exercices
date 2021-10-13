package POO;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente,  defina as instancias deste objeto e apresente 
 * as informações deste objeto no console. */

public class CustomerClass {
			
			//attributes
			private String name;
			private String fullName;
			private String email;
			private int cpf;
			private int age;
			private int phone;
			
			//Constructor
			public CustomerClass(String name, String fullName, String email, int cpf, int age, int phone)
			{
				this.name = name;
				this.fullName = fullName;
				this.email = email;
				this.cpf = cpf;
				this.age = age;
				this.phone = phone;
			}
			//method
			public void print()
			{
				System.out.print("\nNome:"+name
				+"\nSobrenome: "+fullName
				+"\nE-mail: "+email
				+"\nPhone: "+phone
				+"\nCPF: "+cpf
				+"\nIdade: "+age);
			}
			public void Purchase()
			{
				System.out.println("\nO Cliente "+name+" "+fullName+", realizou uma compra!!");
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getFullName() {
				return fullName;
			}
			public void setFullName(String fullName) {
				this.fullName = fullName;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public int getCpf() {
				return cpf;
			}
			public void setCpf(int cpf) {
				this.cpf = cpf;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public int getPhone() {
				return phone;
			}
			public void setPhone(int phone) {
				this.phone = phone;
			}
			
}
