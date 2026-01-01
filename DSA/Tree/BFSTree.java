import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BFSTree {

    Node root;

    void printLevelOrder() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.key + " ");

            if (temp.left != null)
                queue.add(temp.left);

            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args) {

        BFSTree tree = new BFSTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("BFS (Level Order Traversal):");
        tree.printLevelOrder();
    }
}
