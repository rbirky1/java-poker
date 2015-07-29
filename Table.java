// *****************************************************************
// Table.java                                                      *
//   A wise man once said, "Ya dun goofd."                         *
// Authors: Rachael Birky and DSB                                  *
// This program will do stuff and etc. But its for the poker prog  *
// and cool stuff like that. This is a table.                      *
//        So one day i met this guy who turned into a fish.        *
// *****************************************************************

import java.util.Scanner;
public class Table
{
	Deck Jumanji;
	Hand human;
	Hand bob;
	
	public Table()
	{
		Jumanji = new Deck();
	}
	
	public void Deal()
	{
		human = new Hand(Jumanji);
		bob = new Hand(Jumanji);
	}
	
	public void shuffle()
	{
		Jumanji.Shuffle();
	}
	
	public void printHand()
	{
		human.SortHand(); //why r all ur methods capitalized >.>
		human.printHand();
	}
	
	public void printAIHand()
	{
		bob.SortHand();
		bob.printHand();
	}
	
	public String evaluateHand()
	{
		return human.eval();
	}
	
	public String evaluateAIHand()
	{
		return bob.eval();
	}
	
	public String whoWinsYo()
	{
		if (bob.getMaxHand()==human.getMaxHand())
		{
			 if (bob.getHighest()>human.getHighest()) return "You LOST. D:";
			 else return "YOU WON!! :D";
		}
		else if (bob.getMaxHand()>human.getMaxHand()) return "You LOST. D:";
		else return "YOU WON!! :D";
	}
	
	public void discardYo(int numCardsYo)
	{
		human.discard(numCardsYo);
	}
	//haha a random comment. mhm. which serves no purpose. This better save! >:(
	
	//pass deck and num cards to draw to the hands method
	public void drawYo(int cardToReplace)
	{
		human.draw(cardToReplace, Jumanji);
	}
	
	public void drawAIYo()
	{
		bob.drawAI(Jumanji);
	}
}