import java.util.Scanner;
public class Main{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
Player player = new Player();
int houses=0;

System.out.println("How many houses would you like to visit?");
houses=input.nextInt();
for (int i=1; i <=houses; i++){
player.TrickOrTreat();
}




}
}
