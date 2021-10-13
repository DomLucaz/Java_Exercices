package POO;

public class CustomerObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerClass Customer = new CustomerClass("Lucas","Figueiredo","lucas@gmail.com",1112523654,28,1198585364);
		
		System.out.println("---------CLIENTE---------");
		Customer.print();
		
		System.out.println("\n\nAlterando o CPF e E-mail do cliente");
		Customer.setCpf(1212323859);
		Customer.setEmail("lucaz@gmail.com");
		System.out.println("---------CLIENTE---------");
		Customer.print();
		Customer.Purchase();
	}

}
