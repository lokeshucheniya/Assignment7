
public class PaymentGateway {
	//method to transfer the given amount from the source to target account.
		public static boolean transfer(Account sender, Account reciever, double amount) 
		{
			
			boolean status;
			if(sender.getBalance() == amount) { 			//If account balance is same as given amount then perform the operations
				sender.withdraw(amount);
				reciever.deposit(amount);
				status = true;
			}
			else {
				status = false;					
			}
			return status;
		}
}
