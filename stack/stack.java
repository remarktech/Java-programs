/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
//import java.util.*;
import java.util.Stack;
public class stack{
    static public int getMaxArea(int hist[], int n)
    {
     int maxArea = 0;
     int tp;
     int area_With_Top;
        Stack <Integer> st = new Stack<>();
        int i=0;
        while(i < n)
        {
            if(st.empty() || hist[st.peek()] <= hist[i]) {
                st.push(i++);
            }
            else{
                tp=st.peek();
                st.pop();
                area_With_Top = hist[tp]*(st.empty() ? i : i - st.peek() - 1);
                if(area_With_Top > maxArea)
                {
                    maxArea = area_With_Top;
                }
            }
        } 
        while(!st.empty())
        {
            tp=st.peek();
                st.pop();
                area_With_Top = hist[tp] * (st.empty() ? i : i - st.peek() - 1);
                if(area_With_Top > maxArea)
                {
                    maxArea = area_With_Top;
                }
        }
     
     return maxArea;
    }
    public static void main(String[] args){
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 }; 
	System.out.println("Maximum area is " + getMaxArea(hist, hist.length));         
    }
}
