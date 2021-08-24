
package seanpoker;

//import seanpoker.analyze.PokerHandAnalyzer;

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
		String[] deck = analyzer.deck;
		String[] hand = {deck[0],deck[12],deck[20],deck[45],deck[1]};
		System.out.println(analyzer.analyzeHand(hand));
//		for(String item : deck)
//		{
//			System.out.println(item);
//		}
//		System.out.println("Hello Sean");
	}
	
}
