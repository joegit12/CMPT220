import java.util.Scanner;

public class tryCatchLecture {
    public static void main(String[] args) throws Exception {
        int firstNum = 0;
        Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
        System.out.println("Enter first number of calculator: ");
        String line = sc.nextLine();
       try {
        firstNum = Integer.parseInt(line);
       } catch (Exception e) {
        System.out.println("try again");
       }
    }

    }


}

