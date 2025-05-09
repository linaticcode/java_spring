
import java.util.Arrays;
import java.util.List;

public class optional {
    public static void main(String[] args) {
        
      List<String> names = Arrays.asList("Navin" , "Laxhmi" , "John" , "Kisher");

      // String name = names.stream()
      //                .filter(str -> str.contains("x"))
      //                .findFirst()
      //                .orElse("Not Found");

      // System.out.println(name);

    List<String> uNames = names.stream()
                          .map(String::toUpperCase)
                          .toList();
                  
    uNames.forEach(System.out::println);

    } 
}