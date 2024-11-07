package com.example.flashcard.entity;

import java.time.LocalDateTime;
import java.util.ArrayDeque;

public class Deck {

    private int deckId;
    private String deckName;
    private String question;
    private int userId;
    private LocalDateTime createDate;
    private ArrayDeque <Card> flashCards;

    public Deck(int deckId, String deckName, int userId){

        this.deckId = deckId;
        this.deckName = deckName;
        this.userId = userId;

    }

    public int getDeckId() {
        return deckId;
    }

    public void setDeckId(int deckId) {
        this.deckId = deckId;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    //add cards to deck
    public void addCard(String question, int deckId) {
        this.deckId = deckId;
        this.question = question;
    }

    //remove cards from deck
    public void deleteCard(int cardId){

    }

    public ArrayDeque<Card> getFlashCards() {
        return flashCards;
    }

    public void setFlashCards(ArrayDeque<Card> flashCards) {
        this.flashCards = flashCards;
    }
}