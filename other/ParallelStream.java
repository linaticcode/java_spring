
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        
       int size = 10_000; 
       List<Integer> nums = new ArrayList<>(10000);
        
       Random ran = new Random();  
       
       for(int i = 0 ; i <= size ; i++){
          nums.add(ran.nextInt(100));
       }
       
       int sum1 = nums.stream()
                     .map(i -> i * 2)
                     .reduce(0 , (c , e) -> c + e );
       
       long startseq = System.currentTimeMillis();

       int sum2 = nums.stream()
                    .map(i ->{ 

                        try {
                            Thread.sleep(1);
                        } catch (Exception e) {
                        }
                        return i * 2;
                    })
                    .mapToInt(i -> i)
                    .sum();              
       
       long endseq = System.currentTimeMillis();
       
       long startpara = System.currentTimeMillis();

       int sum3 = nums.parallelStream()
                  .map(i ->{ 

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return i * 2;

                }) 
                  .mapToInt(i -> i)
                  .sum();
                //   use of instream
       long endpara = System.currentTimeMillis();
            
       System.out.println(sum2 + " " + sum3) ;
    //    System.out.println(sum3);
       System.out.println(endseq - startseq);
       System.out.println(endpara -  startpara);
    }
}