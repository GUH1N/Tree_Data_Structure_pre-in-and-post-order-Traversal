class Node
{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class traversal
{
    static void in_order(Node node)
    {
        if (node == null) {
            return;
        }
        
        in_order(node.left);
        System.out.print(node.data + " ");
        in_order(node.right);
    }

    static void post_order(Node node)
    {
        if (node == null) {
            return;
        }
        
        post_order(node.left);
        post_order(node.right);
        System.out.print(node.data + " ");
    }

    static void pre_order(Node node)
    {
        if (node == null) {
            return;
        }
        
        System.out.print(node.data + " ");
        pre_order(node.left);
        pre_order(node.right);
    }

    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.left.right.left = new Node(8);
        // root.right = new Node(3);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.right.right.left = new Node(9);
        // root.right.right.right = new Node(10);
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(9);
        root.left.left.right.left = new Node(1);
        root.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
        root.right.right.left = new Node(8);
        System.out.println("In_order: ");
        in_order(root);
        System.out.println("\n");

        System.out.println("pre_order: ");
        pre_order(root);
        System.out.println("\n");

        System.out.println("post_order: ");
        post_order(root);
    }
}