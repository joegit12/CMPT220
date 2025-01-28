import java.util.Scanner;





public class FinalProject {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();
   

     Player startingPG = new Player("Jalen Brunson");
     Player startingSG = new Player("Mikal Bridges");
     Player startingSF = new Player("Josh Hart");
     Player startingPF = new Player("OG Anunoby");
     Player startingC = new Player("Karl-Anthony Towns");

     System.out.println("Who is the starting PG for the New York Knicks?");

    if (answer == startingPG) {
        System.out.println("You are correct! Please proceed to the next question.");
    } else {
        System.out.printlon("Please try again! Capitalization and spacing matters");
    }
       
    System.out.println("Who is the starting SG for the New York Knicks?");
    if (answer == startingSG) {
        System.out.println("You are correct! Please proceed to the next question.");
     } else {
        System.out.println("Please try again! Capitalization and spacing matters");
     }

     System.out.println("Who is the starting SF for the New York Knicks?");
     if (answer == startingSF) {
         System.out.println("You are correct! Please proceed to the next question.");
      } else {
         System.out.println("Please try again! Capitalization and spacing matters");
      }
   
      System.out.println("Who is the starting PF for the New York Knicks?");
    if (answer == startingSF) {
        System.out.println("You are correct! Please proceed to the next question.");
     } else {
        System.out.println("Please try again! Capitalization and spacing matters");
     }

     System.out.println("Who is the starting SG for the New York Knicks?");
    if (answer == startingC) {
        System.out.println("You are correct! Please proceed to the next question.");
     } else {
        System.out.println("Please try again! Capitalization and spacing matters");
     }
    }

        
    }


//You can have a function that takes a score and writes it to a file
//You can have another function that reads a file
//Have a function that gives the user another try in guessing the players name


