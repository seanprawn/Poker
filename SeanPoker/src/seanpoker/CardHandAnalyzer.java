package seanpoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 *
 */
public class CardHandAnalyzer implements CardHandInterface
{
	
	public final String faces = "AKQJT98765432";
    public final String suits = "HDSC"; //Hearts, Diamonds, Spades, Clubs

    public final String[] deck = buildDeck();

	private final int NUMBER_OF_CARDS = 52; // constant number of Cards

    /**
     * @return String array containing a representation of a deck of 52 cards
     * cards are in order, (ie not shuffled yet)
     */
	public String[] buildDeck()
	{
		String[] deck = new String[suits.length() * faces.length()];
		int i = 0;
		for (char s : suits.toCharArray()) {
			for (char f : faces.toCharArray()) {
				deck[i] = "" + f + s;
				i++;
			}
		}
		return deck;
	}
	
	/**
 * Credit for this Algorithm:
 * https://rosettacode.org/wiki/Poker_hand_analyser#Java
 * Content is available under GNU Free Documentation License 1.2
     * //output has been modified to accommodate this app//
 */
	public Score analyzeHand(final String[] hand) {
        if (hand.length != 5)
            return new Score("invalid hand: wrong number of cards", -1, hand);
 
        if (new HashSet<>(Arrays.asList(hand)).size() != hand.length)
            return new Score("invalid hand: duplicates", -1, hand);
 
        int[] faceCount = new int[faces.length()];
        long straight = 0, flush = 0;
        for (String card : hand) {
 
            int face = faces.indexOf(card.charAt(0));
            if (face == -1)
                return new Score("invalid hand: non existing face", -1, hand);
            straight |= (1 << face);
 
            faceCount[face]++;
 
            if (suits.indexOf(card.charAt(1)) == -1)
                return new Score("invalid hand: non-existing suit", -1, hand);
            flush |= (1 << card.charAt(1));
        }
 
        // shift the bit pattern to the right as far as possible
        while (straight % 2 == 0)
            straight >>= 1;
 
        // straight is 00011111; A-2-3-4-5 is 1111000000001
        boolean hasStraight = straight == 0b11111 || straight == 0b1111000000001;
 
        // unsets right-most 1-bit, which may be the only one set
        boolean hasFlush = (flush & (flush - 1)) == 0;
 
        if (hasStraight && hasFlush)
            return new Score("Straight Flush", 1, hand);
 
        int total = 0;
        for (int count : faceCount) {
            if (count == 4)
                return new Score("Four of a kind", 2, hand);
            if (count == 3)
                total += 3;
            else if (count == 2)
                total += 2;
        }
 
        if (total == 5)
            return new Score("Full house", 3, hand);
 
        if (hasFlush)
            return new Score("Flush", 4, hand);
 
        if (hasStraight)
            return new Score("Straight", 5, hand);
 
        if (total == 3)
            return new Score("Three of a kind", 6, hand);
 
        if (total == 4)
            return new Score("Two pair", 7, hand);
 
        if (total == 2)
            return new Score("One pair", 8, hand);
 
        return new Score("High cards", 9, hand);
    }

    /**
	 * Shuffles a deck of cards
	 * keeps the deck and creates and returns a new deck of shuffled cards
	*/
    public ArrayList<String> shuffle()
     {
		 System.out.println(" Shuffling...Shuffling...Shuffling...\n");
		  ArrayList<String> tempDeck = new ArrayList<>();

		    for (int i = 0; i < NUMBER_OF_CARDS; ++i)
			{
            tempDeck.add(deck[i]);
			}

        Collections.shuffle(tempDeck); // Use java collections to shuffle and save time complexity
		  
        return tempDeck;
    } 
}
