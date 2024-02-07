package com.teachmeskills.lesson_10_hw.card;

import java.util.Objects;

/**
 * This class contains fields for a credit card
 */
public class Card {
    String nameCard;
    String numberCard;
    int cvvCode;

    double amount;

    public Card(String nameCard, String numberCard, int cvvCode, double amount) {
        this.nameCard = nameCard;
        this.numberCard = numberCard;
        this.cvvCode = cvvCode;
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvvCode == card.cvvCode && Objects.equals(numberCard, card.numberCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCard, cvvCode);
    }

    @Override
    public String toString() {
        return "Карта: '" + nameCard + '\'' +
                ", номер карты: '" + numberCard + '\'' +
                ", сумма на счету: = " + amount;
    }
}
