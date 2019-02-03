/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anmol
 */
import java.util.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Level_order_traversal
{
	
	
    // driver function to test the above functions
    public static void main(String args[])
    {
		
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
		
            GfG g = new GfG();
            g.printSpiral(root);
			System.out.println();
            t--;
			
        }
    }
}
class GfG
{
      void printSpiral(Node node) 
      {
           // Your code here
          if(node == null)
          return;
          Stack <Node> st1 = new Stack<>();
          Stack <Node> st2 = new Stack<Node>();
          st1.push(node);
          while(!st1.empty() || !st2.empty())
          {
              while(!st1.empty()){
                  Node temp = st1.peek();
                  st1.pop();
                  System.out.print(temp.data + " ");
                  if(temp.right!=null)
                  st2.push(temp.right);
                  if(temp.left!=null)
                  st2.push(temp.left);
              }
              while(!st2.empty()){
                  Node temp = st2.peek();
                  st2.pop();
                  System.out.print(temp.data + " ");
                  if(temp.left!=null)
                  st1.push(temp.left);
                  if(temp.right!=null)
                  st1.push(temp.right);
              }
              
          }
      }
}
