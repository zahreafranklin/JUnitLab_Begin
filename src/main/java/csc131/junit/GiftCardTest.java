package csc131.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiftCardTest {

	@Test
	public void testGetIssuingStore() {
		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}

}
