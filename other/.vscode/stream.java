import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        
       List<Integer> nums = Arrays.asList(4 , 5 , 7 , 2 , 1 , 6);
       
    //    n -> System.out.println(n);

    //    nums.forEach(n -> System.out.println(n));

    //    Stream<Integer> s1 = nums.stream();
    //    Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
    //    Stream<Integer> s3 = s2.map(n -> n * 2);
    //    int result = s3.reduce(0 , (c , e) -> c+e);

       Function<Integer , Integer> fun = n -> n*2;
       
    //    int result = nums.stream()
    //                  .filter(n -> n % 2 == 0)
    //                  .map(n -> n * 2)
    //                  .reduce(0 , (c , e) -> c + e); 

    Stream<Integer> sort = nums.stream()
                .filter(n -> n%2 == 0)
                .sorted();

        // Stream<Integer> s = nums.sort(c)

    //    System.out.println(result);

        sort.forEach(n -> System.out.println(n));
    //    int sum = 0;
    //    for(int n : nums){
        
    //        if(n%2 == 0){
    //              n = n*2;
    //              sum = sum + n;
    //        }

    //    }



    }
}