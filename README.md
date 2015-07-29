# java-poker
**Spring 2011**

This repository contains Java files that work together to allow the user to play Poker against a computer.

-**Card.java:** A class representing a card with a *suit, color, number,* and *value*.

-**Deck.java:** A class representing a deck of cards using an array. It initializes the deck with the correct 52 cards, shuffles using a random generator, and deals and draws cards from the top of the deck.

-**Hand.java**: A class representing a hand of 5 cards. It sorts and analyzes itself for a *royal flush, straight flush, four of a kind, flush, three or a kind, or a pair.* It can also get the highest valued card and print the cards to the screen.

-**Table.java**: A class representing the table, which contains the *deck, player, and AI.* It also contains methods to control the flow of the game.

-**pokerDriver.java**: The driver program that begins the game and presents options to the player.
