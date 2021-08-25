package com.binarysearch;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> right;
    MyBinaryNode<K> left;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }


public class MyBinarySearch{
    @TEST
    <MyBinaryTree>
    void given3NodeswhenaddedtoBinarySearchTree(){
        MyBinaryTree<Integer>myBinaryNode=new MyBinaryTree<>();
        MyBinaryTree.add(56);
        MyBinaryTree.add(30);
        MyBinaryTree.add(70);
        int size =MyBinaryTree.getSize();
        Assert.assertEquals(3,size);
    }
}
public class MyBinaryTree extends Comparable<K>>

    {
        private MyBinaryNode<K> root;
        private MyBinaryNode<K> addRecursive;

        public void add (K key){
        addRecursive = this.addRecusive(root, key()->{
            int compareResult1 = key.compareTo(root.Key);
        });
        this.root = addRecursive;
    }
        private MyBinaryNode<K> addRecursive (MyBinaryNode < K > current, K key){
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(root.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0) {
            current.left = addRecursive(current, left, key);
        } else {
            current.left = addRecursive(current, right, key);
        }
        return current;
    }
        @Test
            <MyBinaryTree >
        void given3nodeswhenaddedtoBST () {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getsize();
        Assert.assertEquals(3, size);
    }
    }








