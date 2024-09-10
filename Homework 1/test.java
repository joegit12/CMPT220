//always start with importing our scanner so we can use it!
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("What is your first name?");
        String firstname = input.nextLine();
        System.out.println("Hi, " + firstname);


        System.out.println("What is your last name?");
        String lastname = input.nextLine();
        System.out.println("Thank you, " + firstname + " " + lastname);
       






    }

}