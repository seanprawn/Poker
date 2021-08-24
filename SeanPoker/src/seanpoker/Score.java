package seanpoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * This stores the current hand and the weight of the hand
 */
public class Score {
    public final int weight;
    public final String name;
    public final String[] hand;
    public final HashMap<String,String> suitIcons = new HashMap<String, String>()
    {{
        put("H", "\u2665");
        put("D", "\u2666");
        put("C", "\u2663");
        put("S", "\u2660");

    }};

    /**
     * Credit for this library:
     * https://rosettacode.org/wiki/Poker_hand_analyser#Java
     * Content is available under GNU Free Documentation License 1.2
     * content has been modified to accommodate this app
     */
    public Score(String n, int w, String[] h) {
        this.weight = w;
        this.name = n;
        this.hand = h != null ? h.clone() : h;
    }

    @Override
    public String toString()
    {
        return "Your hand: "+ Arrays.toString(hand) + " \nYou Have: " + name;
    }

    /**
     * @return Hand object
     *
     * this returns the current hand
     * the hand consists of 5 card objects and the weight of the hand
     */
    public Hand createCardsAndHand()
    {
        ArrayList<Card> result = new ArrayList<>();

        for (int i=0; i < hand.length;i++)
        {
            String index = this.hand[i];
            String letter = index.substring(1,2);
            Card card = new Card(this.hand[i].substring(1,2),this.hand[i].substring(0,1),this.suitIcons.get(letter));
            result.add(card);
        }
        Hand hand = new Hand(result,this.weight);
        return hand;
    }
}

