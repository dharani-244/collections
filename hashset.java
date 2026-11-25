import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> courses=new HashSet<>();
         courses.add("java");
         courses.add("python");
         courses.add("rest");
         courses.add("java");
         System.out.println(courses);
         System.out.println("\ncontains java: "+courses.contains("java"));
         courses.remove("python");
         System.out.println("After removal: "+courses);
    }
    
}
