
import java.io.IOException;

class Counter
{
    int count =0 ;
     public void increment()
    {
        count++;
    }

}

// class A implements Runnable
// {
//     public void run()
//     {
//         for (int i = 1; i <= 5; i++) {
//                 System.out.println("hi");
//             try {   
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//             }
//         }
//     }
// }

// class B implements Runnable
// {
//      public void run()
//      {
//         for(int i = 1; i <= 5 ; i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//             }
//         }
//      }
// }

// the runnable object doesnt have separate thread[] method

public class threads {
    public static void main(String[] args) throws IOException, InterruptedException {
         
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();
        
        Counter c = new Counter();
        
        Runnable obj1 = () -> 
        {
                for (int i = 1; i <= 1000; i++){
                    c.increment();
                    // System.out.println(c.count);
                }   
             
        };

        Runnable obj2 = () -> 
        {
             
            for (int i = 1; i <= 1000; i++){
                    c.increment(); 
                    // System.out.println("/");
            }    
      
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // try {
        //     Thread.sleep(5,1); // Sleep for 15 seconds
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        
        System.out.println(c.count);

    }
}