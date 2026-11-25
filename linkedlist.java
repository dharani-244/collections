import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> num1=new LinkedList<>();
       
        num1.add("java");
        num1.add("python");
        num1.addFirst("traing");
        num1.addLast("class");
        System.out.println(num1);

        num1.removeFirst();
        num1.removeLast();
        System.out.println(num1);
    }
    
}
