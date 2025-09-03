package project;

//Custom Exception for insufficient balance
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}
class InvalidAmountException extends RuntimeException {
	 public InvalidAmountException(String message) {
	     super(message);
	 }
	}
public class Main{
	private String acc_name;
	private double bal;
	public Main(String name,double openbal) throws InvalidAmountException{
		if (openbal<0) {
			throw new InvalidAmountException("opening amount cannot be negative");
		}
		this.acc_name=name;
		this.bal=openbal;
		}
	public void Withdraw(double amt, int pin) throws InsufficientFundsException{
		if (amt<=0) {
			throw new InsufficientFundsException("Withdraw must be positive");
		}
		if(amt>bal) {
			throw new InsufficientFundsException("InsufficientFundsException funds"+(amt-bal));
		}
		bal=bal-amt;
		System.out.println("Withdrawn amt"+amt+"Remaining Balance");
	}
	public void deposit(double amt) throws InvalidAmountException{
		if(amt<=0) {
			throw new InvalidAmountException("Deposit amount must be positive");
		}
		bal=bal+amt;
	}
	public double getbal() {
		return bal;
	}
	public static void main(String[] args) {
		Main rahul=new Main("Rahul",1000.45);
		try {
			rahul.Withdraw(2000.45,0);
		}
		catch (InvalidAmountException e) {
			System.out.println("Invalid Amount"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Parent exception class"+e.getMessage());
		}
		finally {
			System.out.println("Your Session Expired");

		}
		try {
			rahul.deposit(-200);
		}
		catch(InvalidAmountException e) {
			System.out.println("Deposit error"+e.getMessage());
	
		}
		System.out.println("Final Balance of "+rahul.acc_name+" "+rahul.getbal());

	}
}
