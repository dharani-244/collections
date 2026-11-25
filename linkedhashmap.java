import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> details=new LinkedHashMap<>();
        details.put("dharani",101);
        details.put("rahul", 102);
        details.put("ram",103);
        System.out.println(details);
        details.remove(101);
        System.out.println(details.get(101));
        


    }
    
}
