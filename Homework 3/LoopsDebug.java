
import java.util.Scanner;
public class LoopsDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the fatorial: ");
        

        int num = sc.nextInt();
        //here's a hint
        for (int i = num; i < 0; i--){
            System.out.println(num);

        }

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        
        int digit = sc.nextInt();
        for (int i = digit; i <= digit; i += 2 ){
            System.out.println(digit);
        }
        //No hint! what do you need to complete this task?


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
            
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        
        String word = sc.nextLine();
        String reverse = "";
        for (int i = 0; i < word.length(); i++){
            reverse = word.charAt(i) + reverse;
            

        }
        System.out.println(reverse);
    }
}
