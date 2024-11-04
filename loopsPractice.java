//Slide 18 Loops Slides

import java.util.Scanner;

public class loopsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Please enter a number: ");        
    int userNum = sc.nextInt();
    int sum = 0;
    int i = 5;

    while (i <= userNum) {
        sum += i;
        i += 5;
    }
System.out.println("The sum of all integers from 1 to " + userNum + " is " + sum);

    }
}

