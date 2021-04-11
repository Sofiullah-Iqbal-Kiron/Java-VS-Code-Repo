import java.util.ArrayList;

public class ArrayToBST {
    class Solution {
        class TreeNode {
            int data;
            TreeNode left, right;

            TreeNode(int data) {
                this.data = data;
            }
        }

        public int[] sortedArrayToBST(int[] nums) {
            TreeNode root = makeBST(nums, 0, nums.length - 1);
            int[] toRet = new int[nums.length];
            ArrayList<Integer> res = preorder(root);

            for (int i = 0; i < toRet.length; i++)
                toRet[i] = res.get(i);

            return toRet;
        }

        private TreeNode makeBST(int[] nums, int start, int end) {
            if (start > end)
                return null;

            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = makeBST(nums, start, end - 1);
            root.right = makeBST(nums, mid + 1, end);

            return root;
        }

        private ArrayList<Integer> preorder(TreeNode root) {
            if (root == null) {
                ArrayList<Integer> res = new ArrayList<>();
                return res;
            }
            ArrayList<Integer> res = new ArrayList<>();
            res.add(root.data);
            ArrayList<Integer> left = preorder(root.left);
            ArrayList<Integer> right = preorder(root.right);
            res.addAll(left);
            res.addAll(right);

            return res;
        }
    }
}