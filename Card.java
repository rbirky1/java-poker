// *****************************************************************
// Card.java                                                       *
//            It's ok to be sad sometimes.                         *
// Authors: Rachael Birky and DSB                                  *
// This program will do stuff and etc. But its for the poker prog  *
// and cool stuff like that.                                       *
//                I'm Gay and proud. (but not Rachael - for either)*
// *****************************************************************

import java.util.Scanner;
public class Card
{
	Scanner lol = new Scanner (System.in);
	
	//Variables for number and Face cards
	String suit, color;
	int number, value;
	
	//Variables for Face cards
	String Face;

	public Card(String aSuit, String aColorlol, int aNumberlol, int aValue)
	{
		suit = aSuit;
		color = aColorlol;
		number = aNumberlol;
		value = aValue;
	}
	//face cards.
	public Card(String aSuit, String aColorlol, String aFace, int aValue)
	{
		suit = aSuit;
		color = aColorlol;
		Face = aFace;
		value = aValue;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public String getFace()
	{
		return Face;
	}

	public String printCard()
	{
		if (Face==null) return ""+number+ " of " + suit+"";
			else return ""+Face+ " of " +suit+"";
	}
}