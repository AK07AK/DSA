import java.util.*;
public class Hashmap {
    private class Entry
    {
        private int key;
        private String value;
        public Entry(int key,String value)
        {
            this.key=key;
            this.value=value;
        }
    }
    private static LinkedList<Entry>[] entries = new LinkedList[5];
    public void put(int key,String value)
    {
        int index = hash(key);
        if(entries[index]==null)
            entries[index]=new LinkedList<>();
        var bucket = entries[index];
        for(var entry:bucket)
        {
            if(entry.key==key)
            {
                entry.value = value;
                return;
            }
        }
        var entry = entries[index];
        entry.add(new Entry(key,value));
    }
    public String get(int key)
    {
        int index = hash(key);
        var bucket = entries[index];
        for(var e : bucket)
        {
             if(e.key==key)
             {
               return e.value;
             }
         }

        return "";
    }
    public void remove(int key)
    {
        int index = hash(key);
        var bucket = entries[index];
        if(bucket==null)
            throw  new NullPointerException();
        for(var entry : bucket)
        {
            if(entry.key==key)
            {
                bucket.remove(entry);
                return;
            }
        }
    }
    private static int hash(int key)
    {
        return key%entries.length;
    }
}
