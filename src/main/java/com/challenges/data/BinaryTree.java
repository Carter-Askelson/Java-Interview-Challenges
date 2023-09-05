package com.challenges.data;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	//This implementation only uses Ints and should always be balanced
    public int key;
    BinaryTree leftChild;
    BinaryTree rightChild;
    Boolean isZero = false;

    public BinaryTree(int value) {
        key = value;
        leftChild = null;
        rightChild = null;
    }
    
//    public BinaryTree(char value) {
//        key = value;
//        leftChild = null;
//        rightChild = null;
//    }

    public void insert(BinaryTree root, int value) {
    	if (root.breadthFirstSearch(value) == false || value == 0){
    		if (this.key == 0 && this.isZero == false) {
    			this.key = value;
    			if (value == 0) {
    				this.isZero = true;
    			}
    		}
    		else if (value < this.key) {
    			if (this.leftChild == null) {
    				this.leftChild = new BinaryTree(value);
    			}
    			else {
    				this.leftChild.insert(root, value);
    			}
		    } 
    		else if (value > this.key) {
    			if (this.rightChild == null) {
    				this.rightChild = new BinaryTree(value);
    			}
    			else {
    				this.rightChild.insert(root, value);
		        } 
    			
	    	}
    	}
    }
    
//    public void insertLeft(int value) {
//        if (leftChild == null) {
//            leftChild = new BinaryTree(value);
//        } else {
//            BinaryTree binTree = new BinaryTree(value);
//            binTree.leftChild = leftChild;
//            leftChild = binTree;
//        }
//    }

//    public void insertRight(int value) {
//        if (rightChild == null) {
//            rightChild = new BinaryTree(value);
//        } else {
//            BinaryTree binTree = new BinaryTree(value);
//            binTree.rightChild = rightChild;
//            rightChild = binTree;
//        }
//    }
    
//    public void insertLeft(char value) {
//        if (leftChild == null) {
//            leftChild = new BinaryTree(value);
//        } else {
//            BinaryTree binTree = new BinaryTree(value);
//            binTree.leftChild = leftChild;
//            leftChild = binTree;
//        }
//    }
//
//    public void insertRight(char value) {
//        if (rightChild == null) {
//            rightChild = new BinaryTree(value);
//        } else {
//            BinaryTree binTree = new BinaryTree(value);
//            binTree.rightChild = rightChild;
//            rightChild = binTree;
//        }
//    }

    public BinaryTree getLeftChild() {
        return leftChild;
    }
    
    public BinaryTree getRightChild() {
        return rightChild;
    }

    public boolean breadthFirstSearch(int n) {
        Queue<BinaryTree> current = new LinkedList<>();
        Queue<BinaryTree> next = new LinkedList<>();
        current.add(this);

        while (!current.isEmpty()) {
            for (BinaryTree node : current) {
                if (node.key == n) {
                    return true;
                }
                if (node.leftChild != null) {
                    next.add(node.leftChild);
                }
                if (node.rightChild != null) {
                    next.add(node.rightChild);
                }
            }
            current = next;
            next = new LinkedList<>();
        }
        return false;
    }
}