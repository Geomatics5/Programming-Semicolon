/**
 * 
 */
package com.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Geomatics
 *
 */
class AccountTestTest {
	Account account;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() {
		account = new Account();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void accountObjectIsNotNullTest() {
		assertNotNull(account);
	}
	
	@Test
	void accountObjectCanReceiveDepositTest() {
		account.depositMoney(2500);
		assertEquals(2500, account.getAccountBalance());
		
		account.depositMoney(5_000);
		assertEquals(7500, account.getAccountBalance());
	}
	
	@Test
	void accountWillNotTakeNegativeAmountTest() {
		account.depositMoney(5_000);
		account.depositMoney(-1500);
		
		int accountBalance = account.getAccountBalance();
		assertEquals(5000, accountBalance);
	}
	
	@Test
	void accountCanWithdrawTest() {
		account.depositMoney(7000);
		account.withdraw(4000);
		assertEquals(3000, account.getAccountBalance());
	}
	
	@Test
	void accountCanWithPin() {
		account.depositMoney(7000);
		account.withDrawWithPin(1234, 2000);
		assertEquals(5000, account.getAccountBalance());
	}
	@Test
	void canNotWithDrawWithWrongPin() {
		account.depositMoney(3000);
		account.withDrawWithPin(1289, 2500);
		assertEquals(3000, account.getAccountBalance());
	}
	@Test
	void canWithDrawWithHisBalance() {
		account.depositMoney(5000);
		account.withDrawMoney(7000);
		assertEquals(5000, account.getAccountBalance());
	}
	
	@Test
	void cannotWithDrawWithMinimumBalance() {
		account.depositMoney(5000);
		account.withDrawMoney(4000);
		assertEquals(1000, account.getAccountBalance());
		account.withDrawMoney(1000);
		assertEquals(1000, account.getAccountBalance());

	}
		
	
	
}

