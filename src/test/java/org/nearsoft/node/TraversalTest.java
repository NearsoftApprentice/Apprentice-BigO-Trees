package org.nearsoft.node;

import org.junit.Before;
import org.junit.Test;


public class TraversalTest {

    Node root;

    @Before
    public void before() {
        Node leftNodeAA = new Node(null, null, null, 12);
        Node rightNodeAB = new Node(null, null, null, 23);
        Node leftNodeBA = new Node(null, null, null, 54);
        Node rightNodeBB = new Node(null, null, null, 76);
        Node leftNodeA = new Node(leftNodeAA, rightNodeAB, null, 17);
        Node rightNodeB = new Node(leftNodeBA, rightNodeBB, null, 72);
        root = new Node(null, null, null, 50);
        root.setLeftNode(leftNodeA);
        root.setRightNode(rightNodeB);
        leftNodeA.setLeftNode(leftNodeAA);
        leftNodeA.setRightNode(rightNodeAB);
        rightNodeB.setLeftNode(leftNodeBA);
        rightNodeB.setRightNode(rightNodeBB);
    }

    @Test
    public void testTraversal() {
        System.out.println(Node.inOrderTraversal(root));

    }
}
