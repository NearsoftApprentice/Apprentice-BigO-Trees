package org.nearsoft.node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TraversalTest {

    Node root;

    @Before
    public void before() {

        Node leftAAA = new Node(null, null, null, 9);
        Node rightAAB = new Node(null, null, null, 14);
        Node leftABA = new Node(null, null, null, 19);
        Node leftBAB = new Node(null, null, null, 67);


        Node leftNodeAA = new Node(leftAAA, rightAAB, null, 12);
        Node rightNodeAB = new Node(leftABA, null, null, 23);
        Node leftNodeBA = new Node(null, leftBAB, null, 54);
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
        Assert.assertEquals("9-12-14-17-19-23-50-54-67-72-76", Node.inOrderTraversal(root).toString());
    }
    @Test
    public void randomTest(){
        int half = 1;
        System.out.println(++half);
    }
}
