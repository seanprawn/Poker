package seanpoker;

import java.util.ArrayList;

/**
 * Card Interface to allow abstraction and easier implementation of other card games
 */
public interface CardHandInterface {
    Score analyzeHand(final String[] hand);
    ArrayList<String> shuffle();
    String[] buildDeck();
}
