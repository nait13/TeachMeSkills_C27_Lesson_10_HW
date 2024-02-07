package com.teachmeskills.lesson_10_hw.client;

import com.teachmeskills.lesson_10_hw.card.Card;

/**
 * This is the Client class it contains fields and a method "findDuplicateCard" for finding duplicate cards
 */
public class Client {
    String name;
    private Card[] cards;

    public Client(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public Client(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public void findDuplicateCard(Card[] arr) {
        int counter = 0;
        if (arr == null) {
            System.out.println(name + " у вас нет карт!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        System.out.println(arr[i] + " совподает с " + arr[j] + " ");
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                System.out.println(name + " у вас " + counter + " одинаковых карт");
            } else {
                System.out.println("Нет дубликатов карт");
            }
        }

    }
}
