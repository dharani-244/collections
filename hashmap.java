import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> details=new HashMap<>();
        details.put("dharani",101);
        details.put("rahul", 102);
        details.put("ram",103);
        System.out.println(details);
        details.remove(101);
        System.out.println(details.get(101));
        
    }
    
}
