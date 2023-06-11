package src;

import java.util.*;

/**
 * Represents a deck of playing cards.
 */
public class Deck {
    private LinkedList<Card> cards;

    /**
     * Constructs a deck of cards.
     */
    public Deck() {
        cards = new LinkedList<>();
        initializeDeck();
    }

    /**
     * Initializes the deck with all 52 cards.
     */
    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * Shuffles the deck of cards.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Draws a card from the top of the deck.
     *
     * @return the drawn card
     */
    public Card draw() {
        return cards.poll();
    }
}
