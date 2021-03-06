package hard;

import dataStructure.TreeNode;

/**
 * @author: decaywood
 * @date: 2015/9/5 16:30.
 *
 * Given a root of Binary Search Tree with unique value for each node.  Remove the node with given value. If there is no such a node with given value in the binary search tree, do nothing. You should keep the tree still a binary search tree after removal.
 *
 * Example
 * Given binary search tree:
 *
 *          5
 *         / \
 *        3   6
 *       / \
 *      2   4
 *
 * Remove 3, you can either return:
 *
 *          5
 *         / \
 *        2   6
 *         \
 *          4
 *
 * or :
 *
 *          5
 *         / \
 *        4   6
 *       /
 *      2
 *
 *
 *
 * 思路：
 * 删除一个节点分为三种情况（要删除的节点记为z）：
 * 1、若z没有子女，则修改其父节点p[z]使其为null
 * 2、若z只有一个子女，则可以通过在其子节点与父节点建立一条连接来删除
 * 3、若z有两个子女，先删除z的后继y（y没有左子女--y为z右子树中最小节点），然后将y的val代替z的val
 *
 */
public class RemoveNodeInBinarySearchTree {

    public TreeNode removeNode(TreeNode root, int value) {
        if (root == null) return null;
        if (value < root.val) root.left = removeNode(root.left, value);
        if (value > root.val) root.right = removeNode(root.right, value);
        if (value == root.val) {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;
            TreeNode successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            root.val = successor.val;
            root.right = removeNode(root.right, successor.val);
        }
        return root;
    }

}
