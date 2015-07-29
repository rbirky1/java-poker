// *****************************************************************
// Deck.java                                                       *
//            That's all i've got to say about that.               *
// Authors: Rachael Birky and DSB                                  *
// This program will do stuff and etc. But its for the poker prog  *
// and cool stuff like that. This is the Deck.                     *
//          There was this book about this guy that was gay.       *
// *****************************************************************

import java.util.Scanner;
import java.util.Random;
public class Deck
{
	Card[] Deck;
	final int size = 52;
	String Clubs = "__O";
	String Hearts = "<3";
	String Spades = "--|>";
	String Diamonds = "<>";
	String Black = "Black";
	String Red = "Red";
	String Jack = "Jack";
	String Queen = "Queen";
	String King = "King";
	String Ace = "Ace";
	
	public Deck()
	{
		Deck = new Card[size];
		//This for loop does 2-10 of the Clubs. __O
		for (int i= 2; i<=10; i++)
		{
			int j=0;
			Deck[j]= new Card(Clubs, Black, i, i);
			j++;
		}
		//These declare the face cards for Clubs. __O
		Deck[9] = new Card(Clubs, Black, Jack, 11);
		Deck[10] = new Card(Clubs, Black, Queen, 12);
		Deck[11] = new Card(Clubs, Black, King, 13);
		Deck[12] = new Card(Clubs, Black, Ace, 14);
		//This for loop does 2-10 of the Hearts. <3
		for (int i=2; i<=10; i++)
		{
			int j=13;
			Deck[j]=new Card(Hearts, Red, i, i);
			j++;
		}
		//These declare the face cards for Hearts.  <3
		Deck[22] = new Card(Hearts, Red, Jack, 11);
		Deck[23] = new Card(Hearts, Red, Queen, 12);
		Deck[24] = new Card(Hearts, Red, King, 13);
		Deck[25] = new Card(Hearts, Red, Ace, 14);
		//This for loop does 2-10 of the Spades. --|>
		for (int i=2; i<=10; i++)
		{
			int j=26;
			Deck[j]=new Card(Spades, Black, i, i);
			j++;
		}
		//These declare the face cards for Spades --|>
		Deck[35] = new Card(Spades, Black, Jack, 11);
		Deck[36] = new Card(Spades, Black, Queen, 12);
		Deck[37] = new Card(Spades, Black, King, 13);
		Deck[38] = new Card(Spades, Black, Ace, 14);
		//This for loop does 2-10 of the Diamonds. <>
		for(int i=2; i<=10; i++)
		{
			int j=39;
			Deck[j]=new Card(Diamonds, Red, i, i);
			j++;
		}
		//These declare the face cards for Diamonds. <>
		Deck[48] = new Card(Diamonds, Red, Jack, 11);
		Deck[49] = new Card(Diamonds, Red, Queen, 12);
		Deck[50] = new Card(Diamonds, Red, King, 13);
		Deck[51] = new Card(Diamonds, Red, Ace, 14);
	}
	
	public void Shuffle()
	{
		Random gen = new Random();
		for(int count = 0; count < 1000; count++)
		{
		int first = gen.nextInt(52);
		int second = gen.nextInt(52);
		Card temp = Deck[first];
		Deck[first] = Deck[second];
		Deck[second] = temp;
		}
	}
	
	public Card Deal()
	{
		int i = 0;
		while(Deck[i] == null)
		{
			i++;
		}
		Card temp = Deck[i];
		Deck[i]=null;
		return temp;
	}
	
	public Card drawCard()
	{
		int i=0;
		while(Deck[i] == null)
			{
				i++;
			}
		Card temp = Deck[i];
		Deck[i]=null;
		return temp;
	}
	
}