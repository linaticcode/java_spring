
import java.io.IOException;
import java.util.Scanner;

public class Except {
    public static void main(String[] args) throws IOException {
        
           System.out.println("Enter a number");
        //    int num = System.in.read();
        //    It prints the ascii value
        //    InputStreamReader in = new InputStreamReader(System.in);
        //    BufferedReader bf = new BufferedReader(in);

           Scanner sc = new Scanner(System.in);
           
        //    int num = Integer.parseInt(bf.readLine());
           int num = sc.nextInt();
           System.out.println("");

           sc.close();
    }
}