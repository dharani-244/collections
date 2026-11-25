import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
         TreeSet<String> games=new TreeSet<>();
        games.add("basketball");
        games.add("cricket");
        games.add("hockey");
        System.out.println(games);
        System.out.println("\ncontains java: "+games.contains("java"));
         games.remove("python");
         System.out.println("After removal: "+games);

    }
    
}
