package seanpoker;

/**
 * This represents a card in the deck
 * @author sean
 */
public class Card {
    public String suit; //String which consists of a single letter
    public String face; //String which consists of a single letter
    public String icon; //unicode icon used to represent the suit

    public Card(){}

    public Card(String suit, String face, String icon)
    {
        this.suit = suit;
        this.face = face;
        this.icon = icon;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFace() {
        return this.face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getCardDetails()
    {
        return getFace()+" "+getIcon();
    }
}
