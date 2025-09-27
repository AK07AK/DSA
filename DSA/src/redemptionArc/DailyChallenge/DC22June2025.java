package redemptionArc.DailyChallenge;

import java.util.Arrays;

public class DC22June2025 {

    public String[] divideString(String s, int k, char fill) {
        if(s.length()<k)
        {
            while(s.length()!=k)
            {
                s+=fill;
            }
            return new String[]{s};
        }
        int len = s.length()%k==0? s.length()/k : s.length()/k+1;
        String[] res = new String[len];
        int idx=0;

        if(s.length()%k==0)
        {
            int st=0,end=k,i=0;

            while(end<=s.length())
            {
                res[i] = s.substring(st,end);
                st=end;
                end+=k;
                i++;
            }
        }
        else{
            String t=s.substring(0,k);
            int idk=0;
            for(int i=k;i<s.length();i++)
            {
                if(t.length()%k==0)
                {
                    res[idk++]=t;
                    t="";
                }
                t+=s.charAt(i);

            }

            t=res[idk];
            if(t==null) t="";
            int ct=0;
            while(t.length()!=k)
            {
                t+=fill;
            }
        }

        return res;
    }
}
