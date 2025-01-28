import java.util.Scanner;
public class FinalProject {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    String answer = "";
    int score = 0;

     Player startingPG = new Player("Jalen Brunson");
     Player startingSG = new Player("Mikal Bridges");
     Player startingSF = new Player("Josh Hart");
     Player startingPF = new Player("OG Anunoby");
     Player startingC = new Player("Karl-Anthony Towns");


      //increment score by 1 when answer is correct
      //take user input before every if statement


     System.out.println("Who is the starting PG for the New York Knicks?");
     answer = input.nextLine();
    if (answer.equals(startingPG.name)) {
        System.out.println("You are correct! Please proceed to the next question.");
        score++;
    } else {
        System.out.println("Please try again! Capitalization and spacing matters");
    }
       




    System.out.println("Who is the starting SG for the New York Knicks?");
    answer = input.nextLine();
    if (answer.equals(startingSG.name)) {
        System.out.println("You are correct! Please proceed to the next question.");
        score++;
     } else {
        System.out.println("Please try again! Capitalization and spacing matters");
     }





     System.out.println("Who is the starting SF for the New York Knicks?");
     answer = input.nextLine();
     if (answer.equals(startingSF.name)) {
         System.out.println("You are correct! Please proceed to the next question.");
         score++;
      } else {
         System.out.println("Please try again! Capitalization and spacing matters");
      }
   



      System.out.println("Who is the starting PF for the New York Knicks?");
      answer = input.nextLine();
    if (answer.equals(startingPF.name)) {
        System.out.println("You are correct! Please proceed to the next question.");
        score++;
     } else {
        System.out.println("Please try again! Capitalization and spacing matters");
     }





     System.out.println("Who is the starting C for the New York Knicks?");
     answer = input.nextLine();
    if (answer.equals(startingC.name)) {
        System.out.println("You are correct! Please proceed to the next question.");
        score++;
     } else {
        System.out.println("Please try again! Capitalization and spacing matters");
     }



     System.out.println("you got a score of + " + score);
    }
    
    }


//You can have a function that takes a score and writes it to a file
//You can have another function that reads a file
//Have a function that gives the user another try in guessing the players name


