/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanpoker;

import java.util.ArrayList;
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
public class HandTest
{
	
	public HandTest()
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
	 * Test of getCards method, of class Hand.
	 */
	@Test
	public void testGetCards()
	{
		System.out.println("getCards");
		
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card("D","2", "\u2666"));
		cards.add(new Card("D","3", "\u2666"));
		cards.add(new Card("D","4", "\u2666"));
		cards.add(new Card("D","5", "\u2666"));
		cards.add(new Card("D","6", "\u2666"));
	
		Hand instance = new Hand(cards, 1);
		ArrayList<Card> result = instance.getCards();
		assertEquals(result, cards);
	}

	/**
	 * Test of setCards method, of class Hand.
	 */
	@Test
	public void testSetCards()
	{
		System.out.println("setCards");
		
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card("D","2", "\u2666"));
		cards.add(new Card("D","3", "\u2666"));
		cards.add(new Card("D","4", "\u2666"));
		cards.add(new Card("D","5", "\u2666"));
		cards.add(new Card("D","6", "\u2666"));
	
		Hand instance = new Hand();
		instance.setCards(cards);
		assertEquals(instance.getCards(),cards);
	}

	/**
	 * Test of getWeight method, of class Hand.
	 */
	@Test
	public void testGetWeight()
	{
		System.out.println("getWeight");
		
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card("D","2", "\u2666"));
		cards.add(new Card("D","3", "\u2666"));
		cards.add(new Card("D","4", "\u2666"));
		cards.add(new Card("D","5", "\u2666"));
		cards.add(new Card("D","6", "\u2666"));
		
		Hand instance = new Hand(cards, 1);
		
		int expResult = 1;
		int result = instance.getWeight();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setWeight method, of class Hand.
	 */
	@Test
	public void testSetWeight()
	{
		System.out.println("setWeight");
		int weight = 2;
		Hand instance = new Hand();
		instance.setWeight(weight);
		assertEquals(weight, instance.getWeight());

	}
	
}
