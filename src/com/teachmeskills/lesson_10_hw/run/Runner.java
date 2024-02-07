package com.teachmeskills.lesson_10_hw.run;

import com.teachmeskills.lesson_10_hw.card.Card;
import com.teachmeskills.lesson_10_hw.client.Client;

/**
 * This class is for running the program
 */
public class Runner {

    public static void main(String[] args) {
        Card card1 = new Card("BelCard", "222-222", 222, 1500.50);
        Card card2 = new Card("BelCard", "222-222", 222, 1500.50);
        Card card3 = new Card("MasterCard", "333-333", 333, 500.50);
        Card card4 = new Card("VisaCard", "444-444", 111, 1500.5);
        Card card5 = new Card("VisaCard", "444-444", 111, 2320.3);

        Card[] arr = {card4, card1, card2, card3, card5};

        Client client1 = new Client("Alex", arr);
        Client client2 = new Client("Oleg");

        client1.findDuplicateCard(client1.getCards());
        client2.findDuplicateCard(client2.getCards());

    }


}
