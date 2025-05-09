import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class student implements Comparable<student>
{
    int age;
    String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(student that) {
        
         if(this.age > that.age) return 1;

         else return -1;

    }

}

public class collection {
    public static void main(String[] args) {
 
        Map<String , Integer> students = new HashMap<>();

        // students.put("Navin" , 56 );
        // students.put("Harsh" , 56 );
        // students.put("Sushil" , 56 );
        // students.put("Kiran" , 56 );
        
        // System.out.println(students.keySet());

        // System.out.println(students);
        
        Comparator<student> com = (student i , student j) -> i.age > j.age?1:-1;
    
        // {
            
        //     public int compare(String i , String j){
                
        //         if(i.length() > j.length())
        //            return 1;
        //         //    swap
        //         else 
        //           return -1;
        //     }

        // };

        List<student> nums = new ArrayList<>();
        nums.add(new student(21, "Navin"));
        nums.add(new student(19, "John"));
        nums.add(new student(23, "parul"));
        nums.add(new student(34, "kiran"));
        
        Collections.sort(nums);
        
        for(student o : nums){
          System.out.println(o);
        }

        System.out.println(nums);

        // comparable vs comparator
        // comparable - giving power to class to define compare logic
        // comparator - create a custom function outside the class
    }
}