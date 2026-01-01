import java.util.*;

// TreeNode definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

// Solution class
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        // Base case
        if (root == null) {
            return result;
        }

        // Queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // Level order traversal
        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {

                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}

// Main class to test
public class LevelOrderTraversal {
    public static void main(String[] args) {

        /*
               3
              / \
             9  20
                / \
               15  7
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrder(root);

        System.out.println(result);
    }
}
