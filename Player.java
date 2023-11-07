import java.util.Scanner;
import java.util.Random;

public class Player{
String name;
String costume;
int piecesOfCandy;
int option;
int candyR;
Random rand = new Random();

public Player(){
Scanner input = new Scanner(System.in);
System.out.println("What's your name?");
name = input.nextLine();
System.out.println("What's your costume?");
costume = input.nextLine();
}

public void TrickOrTreat(){
System.out.println("=======================================\n");
System.out.println(name+ ": Trick or Treat!");
System.out.println("What an interesting " + costume + " costume!");
option = rand.nextInt(2);
candyR = rand.nextInt(10)+1;
switch (option) {
  case 0:
	System.out.println("Get off my lawn!");
      break;
  case 1:
 	System.out.println("What a lovely costume, Here's " + candyR + " pieces of candy");
        piecesOfCandy+=candyR;
      break;
}
System.out.println("You have " + piecesOfCandy + " total pieces of candy\n");
}


}
