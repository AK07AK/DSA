public class BinaryTree {
    private class Node{
        Node leftChild;
        Node rightChild;
        int val;
        public Node(int val)
        {
            this.val = val;
        }
        @Override
        public String toString(){
            return "Node"+val;
        }
    }

    private Node root;
    public void insert(int val)
    {
        var node = new Node(val);
        if(root==null)
        {
            root = node;
            return;
        }
        Node curr=root;
        while(true)
        {
           if(curr.val<val)
           {
               if(curr.rightChild==null)
               {
                   curr.rightChild=node;
                   break;
               }
               curr=curr.rightChild;
           }
           else {
               if(curr.leftChild==null)
               {
                   curr.leftChild=node;
                   break;
               }
               curr=curr.leftChild;
           }
        }
    }

    public boolean find(int val)
    {

        var curr = root;
        while(curr!=null)
        {
            if(curr.val==val)
                return true;
            if(val> curr.val)
            {
                curr=curr.rightChild;
            }
            else
                curr=curr.leftChild;
        }
        return false;
    }

}
