package problems;
import  java.util.*;
public class AddAndRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    }
    public static List<Integer> findFinalCart(List<Integer> items,List<Integer> query)
    {
        for(int val : query)
        {
            if(val<0)
            {
                val*=-1;
                items.remove(Integer.valueOf(val));
            }
            else if(val>=0)
            {
                items.add(val);
            }
        }
        return items;
    }
}
