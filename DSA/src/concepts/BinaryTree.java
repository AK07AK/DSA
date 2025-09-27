package concepts;

public class BinaryTree {
    private class Node{
        int val;
        Node leftChild;
        Node rightChild;

        public Node(int val)
        {
            this.val = val;
        }
    }
    private Node root;
    public void insert(int val){
        Node newNode = new Node(val);
        if(root==null)
        {
            root = newNode;
            return;
        }
        Node curr = root;
        while(true)
        {

            if(curr.val>val)
            {
                if(curr.leftChild==null)
                {
                    curr.leftChild=newNode;
                    break;
                }
                curr=curr.leftChild;
            }
            else if(curr.val<val)
            {
                if(curr.rightChild == null)
                {
                    curr.rightChild = newNode;
                    break;
                }
                curr=curr.rightChild;
            }

        }
    }
    public  void inorderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorderTraversal(root.leftChild);
        System.out.println(root.val);
        inorderTraversal(root.rightChild);
    }
}
