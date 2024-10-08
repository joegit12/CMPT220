//Slide 18 Loops Slides

import java.util.Scanner;

public class loopsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter a string and I will reverse it");
       String usrInp = sc.nextLine();
       String reverse = "";
        char ch;
        for(int i = 0; i < usrInp.length(); i++){
            ch = usrInp.charAt(i);
            System.out.println("Char acquired was:" + ch);
            reverse = ch + reverse;
            System.out.println("Reversed string at index" + i+ " is " + reverse);
        }
        System.out.println(reverse);



    }
}

