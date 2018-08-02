//Class to test Account functionalites
public class TestAccount {

	public static void main(String[] args) {
		//creating 1st object with initial balance
		Account acc = new Account("Sample1",5000);
		System.out.println(acc);
		
		//getting next account number after 1st object
		int next = Account.getNextAccountNumber();
		System.out.println(next);
		
		//creating 2nd object with zero balance
		Account name = new Account("name");
		System.out.println(name);
		
		//getting next account number after 2nd object
		next = Account.getNextAccountNumber();
		System.out.println(next);
		
		//transferring balance test 1 
		String result = acc.transaction(name, 550);
		System.out.println(result);
		
		//Transferring balance test 2
		result = acc.transaction(name, acc.getBalance());
		System.out.println(result);
		
		//Checking updated balance
		System.out.println(acc);
		System.out.println(name);
	}

}