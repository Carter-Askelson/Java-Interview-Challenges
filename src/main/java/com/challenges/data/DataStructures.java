package com.challenges.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue; 
import java.util.Set;

public class DataStructures {

	public static Integer[] createArray(Integer... args) {
	    int arrayLength = args.length;
	    Integer[] newArray = new Integer[arrayLength];
	    for (int i = 0; i < arrayLength; i++) {
	        newArray[i] = args[i];
	    }
	    return newArray;
	}
	
	public static String[] createArray(String... args) {
	    int arrayLength = args.length;
	    String[] newArray = new String[arrayLength];
	    for (int i = 0; i < arrayLength; i++) {
	        newArray[i] = args[i];
	    }
	    return newArray;
	}

    public static void getTestArray() {
    	System.out.println("Basic Array Initialize");
    	System.out.println("int[] newArray = new int[]{0, 4, 5, 1};");
    	//int[] newArray = new int[]{0, 4, 5, 1};
		
		//System.out.println(newArray[2]);
    	//prints 5

        
    }
    
    
    public static ArrayList<Integer> createList(Integer... args) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer arg : args) {
            newList.add(arg);
        }

        return newList;
    }
    
    public static ArrayList<String> createList(String... args) {
        ArrayList<String> newList = new ArrayList<>();

        for (String arg : args) {
            newList.add(arg);
        }

        return newList;
    }
    
    

    public static void getTestList() {
    	System.out.println("Basic List Initialize");
    	System.out.println("import java.util.ArrayList;");
    	System.out.println("ArrayList<String> newList = new ArrayList<>();");
    	System.out.println("newList.add(\"Lauren\");");
    	//ArrayList myArray = DataStructures.createList(7,2,6);
		
		//System.out.println(myArray.remove(1));
    	//prints 2
    }
    
    public static Stack<Integer> createStack(Integer... args) {
	    int stackLength = args.length;
	    Stack<Integer> newStack = new Stack<>();
	    for (int i = 0; i < stackLength; i++) {
	    	newStack.push(args[i]);
	    }
	    return newStack;
	}
    
    public static Stack<String> createStack(String... args) {
	    int stackLength = args.length;
	    Stack<String> newStack = new Stack<>();
	    for (int i = 0; i < stackLength; i++) {
	    	newStack.push(args[i]);
	    }
	    return newStack;
	}

    public static void getTestStack() {
    	System.out.println("Basic Stack Initialize");
    	System.out.println("import java.util.Stack;");
    	System.out.println("Stack<String> newStack = new Stack<>();");
    	System.out.println("newStack.push(\"Whitney\");");
    	//Stack myArray = DataStructures.createStack(7,1,6);
		
		//System.out.println(myArray.pop());
    	//prints 6
    }
    
    public static Queue<Integer> createQueue(Integer... args) {
	    int queueLength = args.length;
	    Queue<Integer> newQueue = new LinkedList<>();
	    for (int i = 0; i < queueLength; i++) {
	    	newQueue.add(args[i]);
	    }
	    return newQueue;
	}
    
    public static Queue<String> createQueue(String... args) {
	    int queueLength = args.length;
	    Queue<String> newQueue = new LinkedList<>();
	    for (int i = 0; i < queueLength; i++) {
	    	newQueue.add(args[i]);
	    }
	    return newQueue;
	}

    public static void getTestQueue() {
    	System.out.println("Basic Queue Initialize");
    	System.out.println("import java.util.Queue;");
    	System.out.println("Queue<String> newQueue = new LinkedList<>();");
    	System.out.println("newQueue.add(\"Greg\");");
    	//Queue myArray = DataStructures.createQueue(7,1,76);
		
		//System.out.println(myArray.poll());
    	
    	//prints 7
    }
    
    public static LinkedList<Integer> createLinkedList(Integer... args) {
	    int linkedListLength = args.length;
	    LinkedList<Integer> newLinkedList = new LinkedList<>();;
	    for (int i = 0; i < linkedListLength; i++) {
	    	newLinkedList.addLast(args[i]);
	    }
	    return newLinkedList;
	}
    
    public static LinkedList<String> createLinkedList(String... args) {
	    int linkedListLength = args.length;
	    LinkedList<String> newLinkedList = new LinkedList<>();
	    for (int i = 0; i < linkedListLength; i++) {
	    	newLinkedList.addLast(args[i]);
	    }
	    return newLinkedList;
	}

    public static void getTestLinkedList() {
    	System.out.println("Basic LinkedList Initialize");
    	System.out.println("import java.util.LinkedList;");
    	System.out.println("LinkedList<String> newLinkedList = new LinkedList<>();");
    	System.out.println("newQueue.add(\"Lyra\");");
    	//LinkedList myArray = DataStructures.createLinkedList(0,6,16);
		
		//System.out.println(myArray.getLast());
    	
    	// prints 16
    }
    
    

  

    public static <K, V> HashMap<K, V> createHashMap(Object... keyValuePairs) {
        if (keyValuePairs.length % 2 != 0) {
            throw new IllegalArgumentException("Key-value pairs must be provided in pairs.");
        }

        HashMap<K, V> hashMap = new HashMap<>();

        for (int i = 0; i < keyValuePairs.length; i += 2) {
            K key = (K) keyValuePairs[i];
            V value = (V) keyValuePairs[i + 1];
            hashMap.put(key, value);
        }

        return hashMap;
    }
    

    public static void getTestHashMap() {
    	System.out.println("Basic Hashtable Initialize");
    	System.out.println("import java.util.HashMap;");
    	System.out.println("HashMap<String, String> newHashTable = new HashMap<>();");
    	System.out.println("newHashTable.put(\"old\", \"Carter\");");
    	//HashMap myArray = DataStructures.createHashMap(0,"null",2,"even",3,"odd",4,"even",6,"even");
		
		//System.out.println(myArray.get(3));
		//prints odd
    }
    
    public static BinaryTree createBinaryTree(Integer... args) {
        Set<Integer> newSet = new HashSet<>();

        for (Integer i : args) {
            newSet.add(i);
        }

        BinaryTree newBinaryTree = new BinaryTree(0);

        for (Integer value : newSet) {
            newBinaryTree.insert(newBinaryTree, value);
        }

        return newBinaryTree;
    }
    
    

    public static void getTestBinaryTree() {
    	System.out.println("Basic Binary Tree Initialize");
    	System.out.println("Copy/Paste BinaryTree.java file in same folder;");
    	System.out.println("BinaryTree newTree = new BinaryTree(1);");
    	System.out.println("newTree.insert(2);");
    	System.out.println("newTree.insert(3);");
    	//BinaryTree myArray = DataStructures.createBinaryTree(0,1,2,3,4,5,6,7);
		
		//System.out.println(myArray.breadthFirstSearch(7));
    	
    	//prints true since 7 is in the tree
    	
    	// Mine is just for always having a balanced Binary Tree made of Ints
    }
    
    
    public static PriorityQueue createHeap(Object... args) {
	    int heapLength = args.length;
	    PriorityQueue<Object> newHeap = new PriorityQueue<>();
	    for (int i = 0; i < heapLength; i++) {
	    	newHeap.add(args[i]);
	    }
	    return newHeap;
	}
    

    public static void getTestHeap() {
    	System.out.println("Basic Hashtable Initialize");
    	System.out.println("import java.util.PriorityQueue;");
    	System.out.println("PriorityQueue<Character> newHeap = new PriorityQueue<>();");
    	System.out.println("newHeap.add('G');");
    	System.out.println("newHeap.add('S');");
    	System.out.println("newHeap.add('C');");
//    	PriorityQueue myArray = DataStructures.createHeap(5,6,2,4,7,9,1,0);
//		
//		while (!myArray.isEmpty()) {
//		    Object element = myArray.poll();
//		    System.out.println(element);
//		}    prints and ordered list from lowest to highest
		}
}
