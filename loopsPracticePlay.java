import java.util.Scanner;

class PracticePlay {
  public static void main(String []args);
  {
 Scanner cool = new Scanner(System.in);
    String password = "Enough";
    System.out.println("Guess password");
    String usrPass = cool.nextLine();
    if (password.equals(usrPass)){
    System.out.println("Correct");
    } else {
        System.out.print("try again!");
    }



    }
}