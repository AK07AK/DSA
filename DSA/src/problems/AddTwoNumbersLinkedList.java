package problems;

import java.util.List;

public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);

        l1.next=new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(l1,l2);

    }
    private static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode temp = null;
        ListNode new_node=null;
        ListNode curr1=l1;
        ListNode curr2=l2;
        int sum=0,rem=0,carry=0;

        while(curr1!=null && curr2!=null){
            sum+=curr1.val+curr2.val+carry;
            if(sum<10)
            {
                new_node = new ListNode(sum);
                carry=0;
                sum=0;
            }
            else{
                rem = sum%10;
                carry = sum/10;
                new_node = new ListNode(rem);
                sum=0;
            }
            if(temp==null)
            {
                temp = new_node;
                res=temp;
            }
            else{
                temp.next=new_node;
                temp=new_node;
            }
            curr1=curr1.next;
            curr2=curr2.next;


        }

        if(curr1!=null)
        {
            while(curr1!=null)
            {
                new_node = new ListNode(curr1.val);
                temp.next = new_node;
                temp=new_node;
                curr1=curr1.next;
            }
        }
        if(curr2!=null)
        {
            while(curr2!=null)
            {
                new_node = new ListNode(curr2.val);
                temp.next = new_node;
                temp=new_node;
                curr2=curr2.next;
            }
        }
        return res;
        }
}

