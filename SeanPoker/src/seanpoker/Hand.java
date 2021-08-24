package seanpoker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The hand object stores all the cards drawn after shuffling the deck
 * Also stores the weight of this hand
 * handStrength constants are used to output correct message to user
 */
public class Hand {
    ArrayList<Card> cards;
    int weight;
    public static final HashMap<Integer, String> handStrength = new HashMap<Integer, String>() // constant values used for output
    {{
        put(1, "Straight Flush");
        put(2, "Four of a Kind");
        put(3, "Full House");
        put(4, "Flush");
        put(5, "Straight");
        put(6, "Three of a Kind");
        put(7, "Two Pair");
        put(8, "One Pair");
        put(9, "High Cards");
}};

    Hand(ArrayList<Card> cards, int weight)
    {
        this.cards = cards;
        this.weight = weight;
//        System.out.println("\nCard 1 in HAND: "+this.cards.get(0).getCardDetails());
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
