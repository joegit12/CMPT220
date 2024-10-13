import java.util.Scanner;


public class MidtermProjectPractice {
    
    public static void main(String[] args) {

        Scanner dealsc = new Scanner(System.in);
        int [] cases = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int [] values = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,105,110,115,120,125,130};

        System.out.print("Please choose your first case: ");
        int firstCase = dealsc.nextInt();
        int firstValue = values[firstCase];
        values[firstCase] = 0;
        String DealorNoDeal = dealsc.nextLine();
        cases[firstCase] = -1;


        int selectedCase;
        for (int i = 0; i < 6; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
       
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}


    for (int i = 0; i < 5; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
       
         sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}

        for (int i = 0; i < 4; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
       
         sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}

       
    for (int i = 0; i < 3; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
      
        
        sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}
        
        for (int i = 0; i < 2; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
       
         sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}

        for (int i = 0; i < 1; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
      
         sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}

        for (int i = 0; i < 1; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
       
        sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}

        for (int i = 0; i < 1; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
     
        sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the next round! Continue!!");
}

        for (int i = 0; i < 1; i++){
            System.out.print("Please select a case: ");
            selectedCase = dealsc.nextInt();
            // the user picks a case that is already selected
            if (cases[selectedCase] == -1){
                System.out.println("Pick a different case, that one was already selected.");
                i --; // makes it so the round does not count
            } else { // the user picks a case that is not selected
                cases[selectedCase] = -1;
                System.out.println("The value of that case is " + values[selectedCase]);
                values[selectedCase] = 0;
            }
        }
       
        sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }                     // banker deal, how do we break out?
System.out.println("The banker is calling!");
System.out.println("The banker would like to make you an offer");
System.out.println("The banker is offering you " + sum/26);
System.out.println("Would you like to accept or keep playing?");
dealsc.nextLine();
if (dealsc.nextLine().equals ("accept")){
    System.out.println("Congrats you won!");
    System.exit(0);
   }   else {System.out.println("Alright on to the LAST round! Continue!!");
}

        //last case scenario (only runs if banker option was not taken)
        int lastCase;
        for(int i = 0; i < cases.length; i ++) {
            if(cases[i] != -1) { //found the last case
                lastCase = cases[i];
            }
        }


        sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i];
        } 
        // they pick the last, or they pick the first
        System.out.print("Do you want the first case or the last case? Type 1 for first and 2 for last: ");
        int choice = dealsc.nextInt();

        if(choice == 1) { // first case
            System.out.println("You picked the first case the value is: " + firstValue);
        } else if(choice == 2) { // last case
           System.out.println("You picked the last case the value is: " + sum);
        } else {
            System.out.println("Not valid");
        }



    }


}
