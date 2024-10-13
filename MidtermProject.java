import java.util.Scanner;

public class MidtermProject{
    Scanner dealsc = new Scanner(System.in);

    // These are the values of all the cases in the game
int [] cases = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
int [] values = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,105,110,115,120,125,130};
String pickedFirstCase = "";
int pickedFirstValue = 0;

System.out.println("Choose your first case");
String firstCase =  dealsc.nextLine();
if (firstCase.equals("one")){
    pickedFirstCase = "One";
    pickedFirstValue = values[0];
    cases[0] = 0;
    values[0] = 0;


for (int i = 0; i <= 6; i++){
    System.out.println("Pick your next case");
    for (int j = 0; j <= cases.length; j++){
        if(cases[j] != 0){
            System.out.print(cases[j] + ",");
        }
    }
    
    String nextCase = sc.nextLine();
    if(nextCase.equals("Twenty-two") && values[21] !=0){
        cases[21] = 0;
        values[21] = 0;
    }
}

//banker suggests $
//banker offer? or keep going?

//if yes
    //print CONGRATS











}
}