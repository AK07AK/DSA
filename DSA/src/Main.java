import problems.Child;
import problems.Parent;
import redemptionArc.DailyChallenge.DC22June2025;
import redemptionArc.LongestSubstringWithoutRepeatingCharacters;
import redemptionArc.algorithms.BinarySearch;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) throws Exception {
        Spreadsheet spreadsheet = new Spreadsheet(3); // Initializes a spreadsheet with 3 rows and 26 columns
        System.out.println(spreadsheet.getValue("=5+7")); // returns 12 (5+7)
        spreadsheet.setCell("A1", 10); // sets A1 to 10
        System.out.println(spreadsheet.getValue("=A1+6")); // returns 16 (10+6)
        spreadsheet.setCell("B2", 15); // sets B2 to 15
        System.out.println(spreadsheet.getValue("=A1+B2")); // returns 25 (10+15)
        spreadsheet.resetCell("A1"); // resets A1 to 0
        System.out.println(spreadsheet.getValue("=A1+B2"));// returns 15 (0+15)
        System.out.println("done");


    }


    public static  boolean isValid(String s) {
        String openParanthesis = "{[(";
        String closingParanthesis = ")}]";
        Stack<Character> stack = new  Stack<>();
        for(char c : s.toCharArray())
        {
            if(c=='{')
                stack.push('{');
            else if(c=='[')
                stack.push('[');
            else if(c=='(')
                stack.push('(');
            else
            {
                if(c=='}')
                {
                    if(stack.peek()!='{')
                    {
                        return false;
                    }
                }
                if(c==')')
                {
                    if(stack.peek()!='(')
                    {
                        return false;
                    }
                }
                if(c==']')
                {
                    if(stack.peek()!='[')
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}