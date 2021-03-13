package csc131.junit;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
import org.junit.rules.ExpectedException; 

public class GiftCardTest {     
	
	@Test     
	public void getIssuingStore() { 
		double  balance;
		int issuingStore; 
		issuingStore = 1337; 
		balance = 100.00; 
		GiftCard card; 
		card = new GiftCard(issuingStore, balance); 
		assertEquals("getIssuingStore()",  issuingStore, card.getIssuingStore());    
		} 
	
	@Test
	public void getBalance()
	{
		double balance;
		balance = 100.00;
		
		int issuingStore;
		issuingStore = 1337;
		
		GiftCard card;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}

	@Test

	public void deduct_RemainingBalance()
	{
		double balance;
		balance = 100.00;

		int issuingStore;
		issuingStore = 1337;

		GiftCard card;
		card = new GiftCard(issuingStore, balance);

		assertEquals("getBalance()", "Remaining Balance:  80.01", card.deduct(19.99));

		
	}

	
	} //end GiftCardTest 