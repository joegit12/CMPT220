/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/
import java.util.Scanner;
public class functionsHW {
    public static void main(String[] args) {

        Scanner lattesc = new Scanner(System.in);
        System.out.print("Enter what kind of latte would you like: ");
        String pleaseLatte = lattesc.nextLine();
        
        Double lattePrice = yourLatteChoice(pleaseLatte);
        if (lattePrice == 0){
            System.out.println("Your choice is unavailable. Please choose another.");
        } else {
            System.out.println("Your " + pleaseLatte  + "is " + lattePrice);
        }
        
    }
   
    public static Double yourLatteChoice(String choice){
       if (choice.equals("Chocolate") ) {
        return 7.00;
       } else if (choice.equals("Vanilla")){
        return 6.50;
       } else if (choice.equals("Regular")){
        return 5.00;
       } else {
        return 0.0;
       }


    }
}
