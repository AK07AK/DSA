package concepts;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(1);
        bt.insert(8);
        String s = "=A1+B1";
        String[] value = s.substring(s.indexOf("=")+1).split("\\+") ;



        System.out.println("A1".matches("[A-Z0-9]+"));
    }
}
