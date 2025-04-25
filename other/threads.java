
import java.io.IOException;

class A extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
                System.out.println("hi");
            try {   
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B extends Thread
{
     public void run()
     {
        for(int i = 1; i <= 100 ; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
     }
}
public class threads {
    public static void main(String[] args) throws IOException {
         
        A obj1 = new A();
        B obj2 = new B();
        
        System.out.println(obj1.getPriority());

        obj1.start();
        obj2.start();

    }
}