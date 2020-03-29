import java.util.Arrays;
public class Main {

   public static void main(String[] args) {
      Student[] a = {
    		  
            new Student(20069, "장종찬", "체육과",3),
            new Student(20070, "최영환", "자동차과",3),
            new Student(20071, "한승목", "간호과",3),
            new Student(20772, "권순성", "순살과",2)
            
      };
      
      Arrays.sort(a);
      print(a,"ID");
      
      Arrays.sort(a, Student.WITH_DEPT);    
      print(a,"학과");
      
      Arrays.sort(a, Student.WITH_NAME);
      print(a,"이름");
      
      Arrays.sort(a, Student.WITH_GRADE);
      print(a,"학년");
      
   }
   
   public static void print(Student[] std, String srt) {
      System.out.println("===================================");
      
      System.out.println(srt);
      
      for(Student s : std) {
         System.out.println(s.toString());
      }
   }
}