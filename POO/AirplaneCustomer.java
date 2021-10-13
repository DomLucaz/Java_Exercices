package POO;

public class AirplaneCustomer {
		private String name;
		private String cpf;
		private String gender;
		private String email;
		private String phone;	
		private int total_purchase=0;
		
		public AirplaneCustomer(String name, String cpf, String gender, String email, String phone)
		{
			this.name = name;
			this.cpf = cpf;
			this.gender = gender;
			this.email = email;
			this.phone = phone;
		}
		public void purchaseItem()
		{
			this.total_purchase++;
		}
		public void refundItem()
		{
			if (total_purchase>0)
			this.total_purchase--;
		}
		
		public void printInfo()
		{
			System.out.println("***Informações do Cliente***\nNome:"+name
			+"\nCPF: "+cpf
			+"\nGenêro: "+gender
			+"\nE-mail: "+email
			+"\nTelefone"+phone
			+"\nTotal de produtos comprados: "+total_purchase);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getTotal_purchase() {
			return total_purchase;
		}
		public void setTotal_purchase(int total_purchase) {
			this.total_purchase = total_purchase;
		}
}
