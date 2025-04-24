
import java.util.Scanner;

public class QuestionService {

   Question[] questions = new Question[2];
   String selection[] = new String[2];

   public QuestionService(){
      questions[0] = new Question("java" , 1 , "java" , "cpp" , "python" , "csharp" ,  "what");
      questions[1] = new Question("cpp" , 2 , "java" , "cpp" , "python" , "csharp" ,  "what");
   }
   
   public void displayQuestions()
   { 
    int i = 0; 
    for(Question q : questions){
            System.out.println("Question No. :" + q.getId());
            System.out.println("Question :" + q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sel = new Scanner(System.in);
            selection[i] = sel.nextLine();
            i++;
     }

     for(String s : selection){
        System.out.println(s);
     }

   }

   public void getscore(){
      
       int score = 0;

       for(int i = 0 ; i < questions.length ; i++){
            
            if(questions[i].getAnswer().equals(selection[i])){
                score++;
            }

       }

       System.out.println("Your score is " + score);

   } 

}