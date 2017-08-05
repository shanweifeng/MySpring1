package com.swf.pattern23.composite;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:49 2017/8/4
 * @Modified By:
 */
public class Tree
{
    TreeNode root = null;
    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
