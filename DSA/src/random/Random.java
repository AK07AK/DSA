package random;
import java.util.*;
public class Random {

    public static void main(String[] args)
    {
        List<String> mainHeader = new ArrayList<>(Arrays.asList("Employee Details","Project Details","Manager Details"));

        //
        List<List<String>> employeeDetails = new ArrayList<>();
        List<String> subHeadersList = new ArrayList<>(Arrays.asList("doj","grade","pyramidLevel"));
        List<String> values = new ArrayList<>(Arrays.asList("14-3-333","A","c2"));

        Map<String,Map<String,String>> entireDetails = new HashMap<>();
        Map<String,String> employeeDetailsMap = new HashMap<>();


        for(int i=0;i<subHeadersList.size();i++)
        {
            employeeDetailsMap.put(subHeadersList.get(i),values.get(i));
        }

        entireDetails.put(mainHeader.get(0),employeeDetailsMap);










    }
}
