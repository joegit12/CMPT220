import java.util.Scanner;
public class iflecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

String myName = "Joe";
String otherName = "Brian";
if (myName == otherName) {
    System.out.println("They are equal");
} else if  (myName != otherName) {
    System.out.println("They are not equal");
}

int num = 4;
if (num > 4) {
    System.out.println("too big");
    } 
else if (num > 0 && num < 5){
    System.out.println("just right");
} 
else {System.out.println("too small");

}

System.out.println("Are you 21 years or older? Please only use digits");
int age = sc.nextInt();
if (age >= 25) {
    System.out.println("You can drink and rent a car");
 } else if (age >= 21 && age < 25) {
        System.out.println("You can drink, but cannot rent a car");
 } else if (age >= 18 && age < 21){
    System.out.println("You can smoke, but cannot drink");
 } else {System.out.println("You can't do any of these");}
}
    
}

    
