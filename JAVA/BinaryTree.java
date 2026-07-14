import java.util.*;

public class BinaryTree {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode createTree() {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(7);

        return root;
    }

    static void preorder(TreeNode root) {

        if (root == null)
            return;

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        System.out.print(root.val + " ");

        inorder(root.right);
    }

    static void postorder(TreeNode root) {

        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);

        System.out.print(root.val + " ");
    }

    static void levelOrder(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode curr = queue.poll();

            System.out.print(curr.val + " ");

            if (curr.left != null)
                queue.offer(curr.left);

            if (curr.right != null)
                queue.offer(curr.right);
        }
    }

    static int lastLevelSum(TreeNode root) {

        if (root == null)
            return 0;
    
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
    
        int sum = 0;
    
        while (!queue.isEmpty()) {
    
            int size = queue.size();
            sum = 0;
    
            for (int i = 0; i < size; i++) {
    
                TreeNode curr = queue.poll();
    
                sum += curr.val;
    
                if (curr.left != null)
                    queue.offer(curr.left);
    
                if (curr.right != null)
                    queue.offer(curr.right);
            }
        }
    
        return sum;
    }
    public static void main(String[] args) {

        TreeNode root = createTree();

        System.out.print("Preorder: ");
        preorder(root);

        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);

        System.out.println();

        System.out.print("Level Order: ");
        levelOrder(root);
    }
}