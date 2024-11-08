import java.util.Scanner;

public class FunctionLecture2 {

    public static void main(String[] args){
        Scanner yourPet = new Scanner(System.in);
        String pName = yourPet.nextLine();
        yourPetsName(pName);
        System.out.println(add(2, 10.20));
        System.out.println(add(1,2));
        System.out.println(add(4.2, 6.9));
        petsName();

    }
    public static int add(int x, int y){
        return(x+y);
    }

    public static double add(double x, double y){
        return(x+y);
    }

    public static double add(int x, double y){
        return(x + y);
    }

    public static void petsName(){
        System.out.println("My pet's name is Scooby. What's yours?");
    }

    public static void yourPetsName(String P){
        System.out.println("Your pets name is: " + P);
    }

    public static String xycoordinate(String x, String y){
        return("("+x+"")
    }

    }
    








