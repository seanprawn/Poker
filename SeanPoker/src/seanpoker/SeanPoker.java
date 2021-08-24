
package seanpoker;

import java.util.ArrayList;

import static seanpoker.Hand.handStrength;


/**
 *
 * @author sean
 */
class SeanPoker
{
	/**
	 * input to the application
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{			
		CardHandAnalyzer analyzer = new CardHandAnalyzer(); // init the analyzer class and the deck

		ArrayList<String> shuffledDeck = analyzer.shuffle(); // shuffle and return the shuffled deck
		//pop the last 5 cards from the top of the deck (like a stack)
		String[] hand = {shuffledDeck.get(51),shuffledDeck.get(50),shuffledDeck.get(49),shuffledDeck.get(48),shuffledDeck.get(47)};
		Score score = analyzer.analyzeHand(hand);
		Hand cardsInHand = score.createCardsAndHand();
		printOutputToUser(cardsInHand);
	}

	/**
	 * @param cardsInHand
	 * Takes cards in hand as input and displays to user, as per spec
	 */
	private static void printOutputToUser(Hand cardsInHand)
	{
		System.out.print("Your hand: ");
		for (int i=0;i<cardsInHand.cards.size();i++)
		{
			System.out.print(cardsInHand.cards.get(i).face + cardsInHand.cards.get(i).icon+" ");
			if (i < cardsInHand.cards.indexOf(cardsInHand.cards.size() -1))
			{
				System.out.print(",");
			}
		}
		System.out.println("\nYou have: "+handStrength.get(cardsInHand.getWeight()));
	}
}
