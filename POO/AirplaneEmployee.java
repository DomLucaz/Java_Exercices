package POO;

import java.text.NumberFormat;

public class AirplaneEmployee {
		private String name;
		private String cpf;
		private String rg;
		private String gender;
		private String email;
		private String birth_date;
		private String registration;
		private String role;
		private Double salary;
		
		public AirplaneEmployee(String name, String cpf, String rg, String gender, String email, String birth_date, String registration, String role, double salary) {
			
			this.name = name;
			this.cpf = cpf;
			this.rg = rg;
			this.gender = gender;
			this.email = email;
			this.birth_date = birth_date;
			this.registration = registration;
			this.role = role;
			this.salary = salary;
		}
		public void increaseSalary(double percent)
		{
			salary *= 1+percent/100;
		}
		public String formatSal()
		{
			NumberFormat nf =
		NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatCoin = nf.format(salary);
			return formatCoin;
		}
		public void printInfo()
		{
			System.out.println("*****Informações do Funcionário*****\nNome: "+name
			+"\nCPF: "+cpf
			+"\nRG: "+rg
			+"\nGênero: "+gender
			+"\nE-mail"+email
			+"\nData de Nascismento: "+birth_date
			+"\nMatrícula: "+registration
			+"\nCargo: "+role
			+"\nSalário: "+this.formatSal());
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
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
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
		public String getBirth_date() {
			return birth_date;
		}
		public void setBirth_date(String birth_date) {
			this.birth_date = birth_date;
		}
		public String getRegistration() {
			return registration;
		}
		public void setRegistration(String registration) {
			this.registration = registration;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		
}
