
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Finally{
    public static void main(String[] args) {
        
       int i = 0;
       int j = 2;
       
       BufferedReader br = null;

       try {
           
          br =  new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());
          System.out.println(num);
          
       }  
      //  catch (Exception e) {
             
      //        System.out.println("Something went wrong");
      //        System.out.println("Bye");

      //  }

       finally
       {
        br.close();
       }

    }
}
