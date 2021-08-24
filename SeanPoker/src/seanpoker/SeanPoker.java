
package seanpoker;

//import seanpoker.analyze.PokerHandAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import seanpoker.analyze.PokerHandAnalyzer;


/**
 *
 * @author sean
 */
class SeanPoker
{			


	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{			
		PokerHandAnalyzer analyzer = new PokerHandAnalyzer();
		ArrayList<String> shuffledDeck = analyzer.shuffle();
		String[] hand = {shuffledDeck.get(51),shuffledDeck.get(50),shuffledDeck.get(49),shuffledDeck.get(48),shuffledDeck.get(47)}; //get the first 5 cards from the top of the deck
		
		Score myHand = analyzer.analyzeHand(hand);
//		addIcon(hand);
//		System.out.print("Your hand: ");
//		System.out.println(myHand.getIconString(hand));
		System.out.println(myHand);
//		System.out.print("You have: ");
		

	}
//	public Score addIcon(Score hand)
//	{
//		System.out.println("\nMy Hand to get Icon: "+hand);
//		Score icon = hand;
//		suitIcons.put("H", "\u2665");
//		suitIcons.put("D", "\u2666");
//		suitIcons.put("C", "\u2663");
//		suitIcons.put("S", "\u2660");
//	
//		return icon;
//	}

	private void addIcon(String[] hand)
	{

	}
	
}
