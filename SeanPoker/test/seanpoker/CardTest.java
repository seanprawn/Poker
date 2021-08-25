/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanpoker;

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
public class CardTest
{

	
	public CardTest()
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
	 * Test of getSuit method, of class Card.
	 */
	@Test
	public void testGetSuit()
	{
		System.out.println("getSuit");
		Card instance = new Card("H","2", "\u2665");
		String expResult = "H";
		String result = instance.getSuit();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setSuit method, of class Card.
	 */
	@Test
	public void testSetSuit()
	{
		System.out.println("setSuit");
		String suit = "C";
		Card instance = new Card();
		instance.setSuit(suit);
		assertEquals(suit, instance.getSuit());
	}

	/**
	 * Test of getFace method, of class Card.
	 */
	@Test
	public void testGetFace()
	{
		System.out.println("getFace");
		Card instance = new Card("H","2", "\u2665");
		String expResult = "2";
		String result = instance.getFace();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setFace method, of class Card.
	 */
	@Test
	public void testSetFace()
	{
		System.out.println("setFace");
		String face = "3";
		Card instance = new Card();
		instance.setFace(face);
		assertEquals(face, instance.getFace());
	}

	/**
	 * Test of setIcon method, of class Card.
	 */
	@Test
	public void testSetIcon()
	{
		System.out.println("setIcon");
		String icon = "\u2660";
		Card instance = new Card();
		instance.setIcon(icon);
		assertEquals(icon, instance.getIcon());
	}

	/**
	 * Test of getIcon method, of class Card.
	 */
	@Test
	public void testGetIcon()
	{
		System.out.println("getIcon");
		Card instance = new Card("H","2", "\u2665");
		String expResult = "\u2665";
		String result = instance.getIcon();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getCardDetails method, of class Card.
	 */
	@Test
	public void testGetCardDetails()
	{
		System.out.println("getCardDetails");
		Card instance = new Card("H","2", "\u2665");
		String expResult = "2 \u2665";
		String result = instance.getCardDetails();
		assertEquals(expResult, result);
	}
	
}
