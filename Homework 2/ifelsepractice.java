//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = sc.nextLine();
if (name.equals("Joe")) {
    System.out.println("Correct! That is your name");
} else if (name.equals("Brian")) {
    System.out.println("Incorrect! That is not your name");
} else {
    System.out.println("You clearly dont understand what a name is");
}
    

    System.out.println("Who is the knicks best player?");
    String player = sc.nextLine();
if (player.equals("Jalen Brunson")){
    System.out.println("You are correct!");
} else if (player.equals("Julius Randle")) {
    System.out.println("He's good, but not quite the best");
} else {
    System.out.println("Nope! It's Jalen Brunson, but if you said Randle than you get another guess");
}

    System.out.println("What is 5 + 5");
    String num = sc.nextLine();
    if (num.toLowerCase().equals("ten")) {
        System.out.println("Correct!");

     }else if (Integer.parseInt(num) == 10){
        System.out.println("Correct");
     }
     else if (Integer.parseInt(num) == 25){
        System.out.println("This is addition, not mulitplication!");
     }
     else {
        System.out.println("Please re-read the question");
     }

    }

 }





