package src;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            hand.add(deck.draw());
        }

        // Print the hand of cards
        System.out.println("Hand of Cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
