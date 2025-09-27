package redemptionArc;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int i=0,j=1;

        int resLength=0;
        String subs=""+s.charAt(i);
        resLength=subs.length();
        while(j<s.length())
        {
            if(subs.contains(""+s.charAt(j)))
            {
                resLength= Math.max(subs.length(), resLength);
                subs="";
                subs+=s.charAt(j);
                i=j;
                j++;
            }
            else{
                subs+=s.charAt(j);
                j++;
            }
        }


        return resLength;



    }
}
