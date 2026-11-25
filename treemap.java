import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> details=new TreeMap<>();
        details.put("dharani",101);
        details.put("rahul", 102);
        details.put("ram",103);
        System.out.println(details);
        details.remove(101);
        System.out.println(details.get(101));
        


    }
    
}
