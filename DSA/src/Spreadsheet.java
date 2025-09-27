import java.util.*;
class Spreadsheet {
    HashMap<Integer,int[]> map = new HashMap<>();
    int[] row=null;

    public Spreadsheet(int rows) {

        for(int i=0;i<rows;i++)
        {
            row = new int[26];
            map.put(i+1,row);
        }
    }

    public void setCell(String cell, int value) {
        int[] currRow = getCurrRow(cell);
        int column = cell.charAt(0)-'A'+1;
        currRow[column] = value;
    }

    public void resetCell(String cell) {
        int[] currRow = getCurrRow(cell);
        int column = cell.charAt(0)-'A'+1;
        currRow[column] = 0;
    }

    public int getValue(String formula) {
        int val1=0,val2=0;
        String[] values = formula.substring(formula.indexOf("=")+1).split("\\+");

        if(isCellPosition(values[0]))
        {
            int column = values[0].charAt(0)-'A'+1;
            val1 = getCurrRow(values[0])[column];
        }
        else{
            val1 = Integer.parseInt(values[0]);
        }

        if(isCellPosition(values[1]))
        {
            int column = values[1].charAt(0)-'A'+1;
            val2 = getCurrRow(values[1])[column];
        }
        else{
            val2 = Integer.parseInt(values[1]);
        }


        return val1+val2;
    }
    private int[] getCurrRow(String cell)
    {
        int rowNum=0;

        if(cell.length()>3)
        {
            rowNum = Integer.parseInt(cell.substring(1));
        }
        else{
            rowNum  = cell.charAt(1)-'0';
        }

        return map.get(rowNum);
    }
    private boolean isCellPosition(String s)
    {
        return s.matches("^(?=.*[A-Za-z])[A-Za-z0-9]+$");
    }
}
