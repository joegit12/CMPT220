import java.util.Scanner;

class PracticePlay 
  public static void main(String []args)
  {
    Scanner cool = new Scanner(System.in);
    String password = "Enough";
    String usrPass = ""; usrPass = "password";
    while (usrPass != password){
        System.out.println("guess password");
        usrPass = cool.nextLine();
        if (password.equals(usrPass)){
        System.out.println("Correct");
     } else {
        System.out.print("try again!");
    }



    }
}
