// *****************************************************************
// Hand.java                                                       *
//   Never fear shadows, for they only mean a light is nearby.     *
// Authors: Rachael Birky and DSB                                  *
// This program will do stuff and etc. But its for the poker prog  *
// and cool stuff like that. This represents a hand. Duhuhuh, thats*
// why its called hand. :D                                         *
//                Uh uh uh, didnt say the magic word.              *
// *****************************************************************

import java.util.Scanner;
public class Hand
{
	final int HandSize = 5;
	int maxHand=0;
	int highestCard;
	String[] handNames = {"Fail", "One Pair", "Two Pairs", "Three of a Kind", "Straight", "Flush", "Full House", "Four of a Kind", "Stright Flush", "Royal Flush"};
	Scanner lol = new Scanner(System.in);
	//Make the hand array.
	Card[] Hand;
	
	public Hand(Deck Jumanji)
	{
		Hand = new Card[HandSize];
		for (int i=0; i<5; i++)
		{
			Hand[i] = Jumanji.Deal();
		}
	}
	
	
	//the last card is not sorted correctly :O
	public void SortHand()
	{
		int minValue;
		for (int i=0; i < 5; i++)
	    {
		//find lowest card in hand
		minValue = i;
		for (int j = i+1; j < 5; j++)
		    if (Hand[j].getValue() < Hand[minValue].getValue())
			    minValue = j;

		//swap Hand[i] with lowest card
		Card temp = Hand[i];
		Hand[i] = Hand[minValue];
		Hand[minValue] = temp;
	    }
	}
	
	public boolean isRoyalFlush()
	{
		if(Hand[4].getValue() == 14 && Hand[3].getValue() == 13 && Hand[2].getValue() == 12
					&& Hand[1].getValue() == 11 && Hand[0].getValue() == 10 
					&& Hand[4].getSuit().equals(Hand[3].getSuit()) && Hand[3].getSuit().equals(Hand[2].getSuit()) 
					&& Hand[2].getSuit().equals(Hand[1].getSuit()) && Hand[1].getSuit().equals(Hand[0].getSuit()) && Hand[0].getSuit().equals(Hand[4].getSuit()) )
					{maxHand=9; return true;}
					else return false;
	}
	
	public boolean isStraightFlush()
	{
		if((Hand[0].getValue()+1) == Hand[1].getValue() && (Hand[1].getValue()+1) == Hand[2].getValue()
			&& (Hand[2].getValue()+1) == Hand[3].getValue() && (Hand[3].getValue()+1) == Hand[4].getValue()
			&& Hand[0].getSuit().equals(Hand[1].getSuit()) && Hand[1].getSuit().equals(Hand[2].getSuit()) 
			&& Hand[2].getSuit().equals(Hand[3].getSuit()) && Hand[3].getSuit().equals(Hand[4].getSuit()))
			{maxHand=8; highestCard=Hand[4].getValue(); return true;}
			else return false;
	}
	
	public boolean isFourThings()
	{
		if(Hand[0].getValue() == Hand[3].getValue() || Hand[1].getValue() == Hand[4].getValue())
			{
				if(Hand[0].getValue() == Hand[3].getValue()) {highestCard=Hand[3].getValue(); maxHand=25; return true;}
				else {highestCard=Hand[4].getValue(); maxHand=7; return true;}
			}
			else return false;
	}
	
	public boolean isFullHouse()
	{
		if((Hand[0].getValue() == Hand[2].getValue() && Hand[3].getValue() == Hand[4].getValue())
			|| (Hand[0].getValue() == Hand[1].getValue() && Hand[2].getValue() == Hand[4].getValue()))
			{maxHand=6; highestCard=Hand[4].getValue(); return true;}
			else return false;
	}
	
	public boolean isFlush()
	{
		int count = 0;
		for(int i=0; i<5; i++)
		{
		if(Hand[0].getSuit().equals(Hand[i].getSuit()))
			count++;
		}
		if (count == 5) {maxHand=5; highestCard=Hand[4].getValue(); return true;}
		else return false;
	}
	
	public boolean isStraight() //I object to this being here. -Dylan.
	{
		if((Hand[0].getValue()+1 == Hand[1].getValue() && Hand[1].getValue()+1 == Hand[2].getValue()
		&& Hand[2].getValue()+1 == Hand[3].getValue() && Hand[3].getValue()+1 == Hand[4].getValue())
		|| (Hand[4].getValue() == 14 && Hand[0].getValue() == 2 && Hand[1].getValue() == 3 
		&& Hand[2].getValue() == 4 && Hand[3].getValue() == 5))
			{maxHand=4; highestCard=Hand[4].getValue(); return true;}
			else return false;
	}
	
	public boolean isThreeKind()
	{
		int j=2;
		int count=0;
		for(int k=0; k<3; k++)
		{if(Hand[k].getValue()==Hand[j].getValue()) count++; j++;}
		
		if (count>=1)
		{
			if(Hand[0].getValue()==Hand[2].getValue()) highestCard=Hand[2].getValue();
			else highestCard=Hand[4].getValue();
			maxHand=3; return true;
		}
		else return false;
	}
	
	public boolean isTwoPairs()
	{
		if((Hand[0].getValue()==Hand[1].getValue() && Hand[2].getValue()==Hand[3].getValue())
			|| Hand[1].getValue()==Hand[2].getValue() && Hand[3].getValue()==Hand[4].getValue())
			{
				if(Hand[2].getValue()==Hand[3].getValue()) highestCard=Hand[3].getValue();
				else highestCard=Hand[4].getValue();
				maxHand=2;
				return true;
			}
			else return false;
	}
	
	public boolean isOnePair()
	{
		int indexHighest=9001;
		int first=0; int second=1; int count=0;
		for(int i=0; i<4; i++)
		{
			if(Hand[first].getValue()==Hand[second].getValue()) {indexHighest=second; count++;}
			first++; second++;
		}
		if(count==1) {maxHand=1; highestCard=Hand[indexHighest].getValue(); return true;}
		//haha cause that wont try to find Hand[9001]; if its true, 9001 would have been replaced.
		else return false;
	}
	
	public int getMaxHand()
	{
		//returns, when graded upward, the int associated
		//with the highest hand the player has
		return maxHand;
		//initialized to zero (FAIL!) so maxHand always has a value
	}
	
	public String getMaxHandName()
	{
		return handNames[maxHand];
	}
	
	public int getHighest()
	{
		//returns highest card in hand to determine winner in the case
		//that human.hand==AI.hand =P
		//***This needs to be worked on...***//
		if(maxHand==0) return Hand[4].getValue(); //haha, if they failed...
		else return highestCard;
	}
	
	//how...do you compare royal flushes? O.o
	
	public void printHand()
	{
		for(int i=0; i<5; i++)
		{
			if (Hand[i].getFace()==null) System.out.println(i+"   "+Hand[i].getValue()+ " of " + Hand[i].getSuit());
			else System.out.println(i+"   "+Hand[i].getFace()+ " of " +Hand[i].getSuit());
		}
	}
	
	public String eval()
	{
		this.isOnePair();
		this.isTwoPairs();
		this.isThreeKind();
		this.isStraight();
		this.isFlush();
		this.isFullHouse();
		this.isFourThings();
		this.isStraightFlush();
		this.isRoyalFlush();
		//haha this looks inefficient, but it works...happy face! :D
		return this.getMaxHandName();
	}
	
	public void discard(int toDiscard)
	{
		for(int i = 0; i<toDiscard; i++)
		{
			System.out.println("Ay yo pick a card to begone with.");
			int cardNum = lol.nextInt();
			Hand[cardNum] = null;
		}	
	}
	
	public void draw(int cardToReplace, Deck Jumanji)
	{
		Hand[cardToReplace] = Jumanji.drawCard();
	}
	
	public void drawAI(Deck Jumanji)	
	{
		int count=0;
		//conditions
		for (int i=0; i<5; i++)
		if (Hand[i].getValue()<5 && count<1) {Hand[i]=Jumanji.drawCard() ;count++;}
	}
}