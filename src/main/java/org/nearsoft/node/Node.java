package org.nearsoft.node;

/**
 * Created by rjimenez on 4/14/17.
 */
public class Node {

    private Node leftNode;
    private Node rightNode;
    private Node parentNode;
    private int key;

    public Node(Node leftNode, Node rightNode, Node parentNode, int key) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.parentNode = parentNode;
        this.key = key;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    private final static String splitter = "-";

    static StringBuilder inOrderTraversal(Node root) {

        StringBuilder traversal = new StringBuilder().append(root.getKey());

        if (root.getLeftNode() != null) {
            traversal.insert(0, inOrderTraversal(root.getLeftNode()).append(splitter));
        }

        if (root.getRightNode() != null) {
            traversal.append(splitter).append(inOrderTraversal(root.getRightNode()));
        }
        return traversal;
    }
}
