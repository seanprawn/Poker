/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanpoker;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sean
 */
public class ScoreTest
{
	
	public ScoreTest()
	{
	}
	
	@BeforeClass
	public static void setUpClass()
	{
	}
	
	@AfterClass
	public static void tearDownClass()
	{
	}
	
	@Before
	public void setUp()
	{
	}
	
	@After
	public void tearDown()
	{
	}

	/**
	 * Test of toString method, of class Score.
	 */
	@Test
	public void testToString()
	{
		System.out.println("toString");
		String[] hand = new String[]{"2H,3D,4H,KS,AS"};
		
		Score instance = new Score("High cards", 9, hand);
		String expResult = Arrays.toString(hand)+" High cards";
		String result = instance.toString();
		assertEquals(expResult, result);

	}

	/**
	 * Test of createCardsAndHand method, of class Score.
	 * this test will test the first and last cards in hand only (not all the cards)
	 */
	@Test
	public void testCreateCardsAndHand()
	{
		System.out.println("createCardsAndHand");
		
		String[] stringHand = new String[]{"2D","3D","4D","5D","6D"}; // Test hand to add to score
		
		ArrayList<Card> cards = new ArrayList<>(); //test hand to pass to Hand object constructor
		cards.add(new Card("D","2", "\u2666"));
		cards.add(new Card("D","3", "\u2666"));
		cards.add(new Card("D","4", "\u2666"));
		cards.add(new Card("D","5", "\u2666"));
		cards.add(new Card("D","6", "\u2666"));
	
		Hand instance = new Hand(cards, 1);
		Score score = new Score("Straight Flush", 1, stringHand);
		Hand result = score.createCardsAndHand();

		assertEquals(result.weight,instance.weight); // checks the weight is the same
		assertEquals(result.getCards().get(0).getCardDetails(),instance.getCards().get(0).getCardDetails()); //checks the first card in hand is the same
		assertEquals(result.getCards().get(4).getCardDetails(),instance.getCards().get(4).getCardDetails()); //checks the last card in hand is the same
	}
	
	/**
	 * Test of Analyze Hand method
	 */
	@Test
	public void testAnalyzeHandScore()
	{
		System.out.println("AnalyzeHand");
		CardHandAnalyzer analyzer = new CardHandAnalyzer(); // init the analyzer class and the deck
		String[] stringHand = new String[]{"2D","3D","4D","5D","6D"}; // Test hand to add to score
		
		Score score = analyzer.analyzeHand(stringHand); //Analyze the hand and return with the score
		assertEquals(score.weight, 1); // Should return 1 for straight flush
//		fail();
	}	
}
