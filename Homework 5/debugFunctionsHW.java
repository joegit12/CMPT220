/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctionsHW {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
     
    System.out.println("Enter a number and receive its factorial");
    int factorial = sc.nextInt();
    problemTwo(factorial);

   
    System.out.println("Enter a number and I will tell you the sum of every other number: ");
    int everyOther = sc.nextInt();
    problemThree(everyOther);

    System.out.println("Enter a string and I will reverse it");
    String reverse = sc.nextLine();
    problemFive(reverse);

    }

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

    public static void problemTwo(int x){
            //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        //here's a hint
        int product = 1;
        for (int i = 1; i <= x; i++){
            product = product * i;
        } 
        System.out.println("Your factorial is " + product);
    }

    public static void problemThree(int x) {
        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        int sum = 0;
        for (int i = 1; i <= x; i+=2){
            sum = sum + i;
       }
       System.out.println("Your sum is " + sum);
        //No hint! what do you need to complete this task?
    }

    public static void problemFive(String word){
          //P5: Take a string from the user and print them the reverse!
          System.out.println("Problem 5");
          //hint
          String reverse = "";
          for (int i = word.length() -1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
          }
          System.out.println("Here is your word in reverse: " + reverse);
    }
}
