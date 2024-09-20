import java.util.Scanner;
public class loopslecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number please");
        int num = sc.nextInt();
        System.out.println(num);
        
        int sum = 0;
        for (int i = 1; i <=num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }


}






