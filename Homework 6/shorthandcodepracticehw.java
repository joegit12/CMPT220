//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.util.Scanner;
public class shorthandcodepracticehw {
    public static void main(String[] args) {
         String[] names = {"Mikal", "Jalen", "Mitch", "OG", "Josh"};
        for (String i: names){
            System.out.println(i);
        }
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

Scanner sc = new Scanner(System.in);

System.out.println("Select a number 90-60 to see what grade it correlates to");
int num = sc.nextInt();
switch(num){
    case 90:
        System.out.println("Your grade is A");
        break;
    case 85:
        System.out.println("Your grade is B+");
        break;
    case 80:
        System.out.println("Your grade is B");
        break;
    case 75:
        System.out.println("Your grade is B-");
        break;
    case 70:
        System.out.println("Your grade is C");
        break;
    case 65:
        System.out.println("Your grade is D");
        break;
    case 60:
        System.out.println("Your grade is F");
        break;
}

System.out.println("Enter your age to the lowest 10 to see if you can drink or not");
int age = sc.nextInt();
switch (age){
    case 0:
    case 10:
        System.out.println("You cannot drink lol");
        break;
    case 20:
        System.out.println("You might be able to drink if you're older then 20");
        break;
    case 30:
    case 40:
    case 50:
    case 60:
    case 70:
    case 80:
    case 90:
        System.out.println("You can drink old man/woman");
        break;
    default: 
        System.out.println("Invalid age entered");
}
int var = 100;
var += 25;
System.out.println(var);

System.out.println(var -= 10);
//System.out.println(var);
System.out.println(var *= 2);
System.out.println(var /= 4);
int var = 20;
String result = (var > 20) ? ("You are of age to drink"): ("You are not of age to drink"); 
System.out.println(result);
    }
 }