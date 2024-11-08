import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("file.txt");
        Scanner sc = new Scanner(inputFile);
            List<String> nameList = new ArrayList<String>();
        while(sc.hasNext()){
          nameList.add(sc.nextLine());
            
        }
        
        System.out.println(nameList);
    
   
    }
}
