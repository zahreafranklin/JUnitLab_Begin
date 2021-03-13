package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
	
	/**
	 * if the amount of the total bill is greater than the balance on the gift-card, the
	 * remaining amount is the amount due
	 */
	
	@Test
	public void deduct_TotalBill() 
	{
		double balance;
		balance = 75.00;
		
		String remaining; 
	
		int issuingStore;
		issuingStore = 1337;
				
		GiftCard card;
		card = new GiftCard(issuingStore, balance);
		remaining = "Amount Due: " + String.format("%6.2f", 15.00);
		assertEquals("getBalance()", remaining, card.deduct(90.00));
	}
	
	
	/**
	 * if there was an error and a negative amount was entered to be deducted
	 * from the gift-card it would display "Invalid transaction"
	 */
	
	@Test
	public void deduct_InvalidAmount() 
	{
		double balance;
		balance = 100.00;
		
		int issuingStore;
		issuingStore = 1337;
		
		String errorMsg;
		
		GiftCard card;
		card = new GiftCard(issuingStore, balance);
		
		errorMsg = "Invalid Transaction";
		assertEquals("getBalance()", errorMsg, card.deduct(-10.00));
	}
	
	@Test
	public void constructor_IllegalBalance() {
	assertThrows(IllegalArgumentException.class,() -> {
		new GiftCard(1, -100.00);
		});
			
		}
	
	@Test
	public void constructor_IncorrectID_Low()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new GiftCard(-1,100.00);});
	}
	
	@Test
	public void constructor_IncorrectID_High() 
	{
		assertThrows(IllegalArgumentException.class,() -> {
			new GiftCard(100000, 100.00);
		});
			
		}
	
	} //end GiftCardTest 