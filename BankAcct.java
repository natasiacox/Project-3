
public class BankAcct {


	private String custname;
	private int acctnum;
	private double balance;

	public BankAcct( String custname, int acctnum, double balance ) {
		
		this.custname = custname;
		this.acctnum = acctnum;
		this.balance = balance;		
	}

	// getter methods
	public String getCustName() {
		
		return this.custname;
	}
	
	public int getAcctNum() {
		
		return this.acctnum;
	}
	
	public double getBalance() {
		
		return this.balance;
	}

	// instance methods
	
	public void deposit( double depamt ) {
		
		this.balance = this.balance + depamt;
	}
	
	public double withdraw( double withamt ) {
		
		if( this.balance >= withamt ) {
			
			this.balance = this.balance - withamt;
			
			return balance;			
		}
		
		else {
			
			 throw new RuntimeException();
		}
	}
	
	
	// toString()
	public String toString() {
		
		System.out.println("Hello " + this.custname + "\n");
		
		String msg = "Hello " + this.custname + "\n";
		msg += "Acct #" + this.acctnum + " has a balance of $" + this.balance;
				
		return msg;
	}

}


