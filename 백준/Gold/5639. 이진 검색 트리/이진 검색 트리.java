import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static TreeNode buildTree(int[] preorder, int start, int end) {
        if (start > end) return null;

        TreeNode root = new TreeNode(preorder[start]);

        int i;
        for (i = start; i <= end; i++) {
            if (preorder[i] > root.val) {
                break;
            }
        }

        root.left = buildTree(preorder, start + 1, i - 1);
        root.right = buildTree(preorder, i, end);

        return root;
    }

    public static void postorderTraversal(TreeNode root) {
        if (root == null) return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] preorder = new int[10000];
        int index = 0;

        while (scanner.hasNextInt()) {
            preorder[index++] = scanner.nextInt();
        }

        TreeNode root = buildTree(preorder, 0, index - 1);
        postorderTraversal(root);
    }
}
