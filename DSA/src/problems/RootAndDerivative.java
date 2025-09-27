package problems;
import java.util.*;
public class RootAndDerivative {
    public static void main(String[] args) {
        List<String>  arr = new ArrayList<>(Arrays.asList("cat","bat","rat"));
        String s ="the cattle was rattled by the battery";
        System.out.println(replaceWords(arr,s));


    }
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] dict = new String[dictionary.size()];
        String[] arr = sentence.split(" ");
        int idx=0;
        for(String item:dictionary)
        {
            dict[idx++] = item;
        }


        for(int k=0;k<arr.length;k++)
        {
            String t = arr[k];
            int min = Integer.MAX_VALUE,index=-1;

            for(int i=0;i<dict.length;i++)
            {
                if(t.indexOf(dict[i])==0)
                {
                    if(dict[i].length()<min)
                    {
                        min = dict[i].length();
                        index=i;
                    }
                }
            }
            arr[k] = index!=-1 ? dict[index]:arr[k];

        }
        String res="";
        for(int i=0;i<arr.length-1;i++)
            res+=arr[i]+" ";
        res+=arr[arr.length-1];

        return res;


    }
}
