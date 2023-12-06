import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAcctTest {


	//testGetCustName asserts that CustName is John Smith
	@Test
	@DisplayName("Customer name")
	public void testGetCustName() {
		
		//instance of BankAcct is created
		BankAcct bankaccount1 = new BankAcct("John Smith", 12345678, 500) ;
		
		assertEquals("John Smith", bankaccount1.getCustName());
	}

	//testGetAcctNum tests if the AcctNum equals to 12345678
	@Test
	@DisplayName("Account number")
	public void testGetAcctNum() {
		
		BankAcct bankaccount1 = new BankAcct("John Smith", 12345678, 500) ;
		
		assertEquals(12345678, bankaccount1.getAcctNum());
	}


	// testDeposit() method asserts that expected value is the actual value of 800
	@Test
	public void testDeposit() {
		BankAcct bankaccount1 = new BankAcct("John Smith", 12345678, 500) ;
		
		bankaccount1.deposit(300);
		
		assertEquals(800, bankaccount1.getBalance());
	}

	//testWithdraw method passes a parameter of 200
	// Assertion tests that expected value of 300 is equal to the actual value
	@Test
	public void testWithdraw() {
		BankAcct bankaccount1 = new BankAcct("John Smith", 12345678, 500) ;
		
		bankaccount1.withdraw(200);
		
		assertEquals(300, bankaccount1.getBalance());
	}


}