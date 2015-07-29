/*******************************************************************************************
 *iDontKnow.java
 *AHHH, Dylan is not here! D: What am I going to do!?!
 *I don't want to do anything w/o his permission!
 *Also, is the table in charge of everything?
 *But we still need a driver program
 *AHH! I can't save anything to the original file
 *The song bulletproof love is stuck in my headdd! I blame you dylan, even tho ur not here
 *And now im wasting tiime Whoops.
 *you typed so much how could ur hands NOT hurt, silly?
 *Trololol -From Dylan. Btw - August Burns Red.
 *******************************************************************************************/
 
 import java.util.Scanner;
 
 public class pokerDriver
 {
 	public static void main(String[] args)
 	{
 		Scanner notlol = new Scanner(System.in);
 		
 		int cardToReplace;
 		
 		System.out.println("POKER");
 		for (int i=0; i<5; i++) System.out.print("\007");
 		System.out.println();
 		
 		Table tableYo = new Table();
 		tableYo.shuffle();
 		tableYo.Deal();
 		

 		System.out.println("Your HAND");
 		System.out.println("=========");
 		tableYo.printHand();
 		System.out.println();
 		

 		System.out.print("Discard any cards? (y/n)");
 		
 		while (notlol.nextLine().equalsIgnoreCase("y"))
 		{
 			System.out.print("Enter number of the card you would like to discard: ");
 			cardToReplace = notlol.nextInt();
 			tableYo.drawYo(cardToReplace);
 			System.out.println();
 			tableYo.printHand();
 			
 			tableYo.drawAIYo();
 			
 			System.out.print("\nDiscard any cards? (y/n)");
 			notlol.nextLine();
 		}
 		
		
 		System.out.println("\n\nYour HAND");
 		System.out.println("=========");
 		tableYo.printHand();
 		System.out.println();
 		System.out.println("AI HAND");
 		System.out.println("=======");
 		tableYo.printAIHand();
 		System.out.println();
 		
 		System.out.println("You have " +tableYo.evaluateHand() +"!");
 		System.out.println("The AI has " +tableYo.evaluateAIHand() +"!");
 		System.out.println();
 		System.out.println(tableYo.whoWinsYo());
 		System.out.println();
 		
 		//YAYYY! I did something that WORKS! :D
  		//make a menu (and methods for that matter) for discardin gold cards/getting new cards
 		//but for now ill just evaluate the AIs hand too and see who won >:D
 		
 		//lolol why beep? D:
 		//1:48=="time to stop working :D"
 		//lol nevermind.
 		//the table should...deal cards and sort cards or something
 		//ahhhhhhhhhh!!!! you fell in a pit...in eighth grade. i think.
 		//here is a quotation of the day from me! "to die would be an awfully big adventure" :D
 		//this program is infested with my typing.
 		//ohhh dylan, you need to get a parking permit form thing. yep yep.
 		//and if youre not here tomorrow, thatd make sense. but then everyone will certainly die D:
 		//oh look at that, we all died D:

 		
 	}
 }