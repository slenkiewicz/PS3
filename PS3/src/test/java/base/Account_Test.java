package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);

	}

	@Test
	public void accountTest1() {
		account acct = new account(1122, 20000.0);
		acct.setAnnualinterestRate(4.5);
		double expectedresult = 23000.0;
		double actualresult = acct.deposit(3000.0);
		assertEquals(expectedresult, actualresult, .5);
		System.out.println(acct.getId());
		System.out.println(acct.getDateCreated());
		System.out.println(acct.getBalance());
		System.out.println(acct.getMonthlyInterestRate());
	}
	
	@Test
	public void accountTest2() throws InsufficientFundsException {
		account acct = new account(1122, 20000.0);
		acct.setAnnualinterestRate(4.5);
		double expectedresult = 17500.0;
		double actualresult = acct.withdraw(2500.0);
		assertEquals(expectedresult, actualresult, .5);
		System.out.println(acct.getId());
		System.out.println(acct.getDateCreated());
		System.out.println(acct.getBalance());
		System.out.println(acct.getMonthlyInterestRate());
	}
	
	@Test
	public void accountTest3() throws InsufficientFundsException {
		account acct = new account(1122, 20000.0);
		acct.withdraw(25000.0);
		}
	}

