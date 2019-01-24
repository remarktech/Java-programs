/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author anmol
 */
public class rain_water_trapping {
     static int a[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
     
     static public int rwt(int n){
         
        int area = 0;
        
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = a[0];
        
        for(int i = 1 ; i < n ;i++)
        left[i] = Math.max(left[i-1], a[i]);
        
        right[n-1] = a[n-1];
        
        for(int i = n-2 ;i >= 0 ;i--)
        right[i] = Math.max(right[i+1], a[i]);
        
        for(int i = 0 ;i < n ;i++)
        {
            area += Math.min(left[i], right[i]) - a[i];
        }
        return area;
    }
   public static void main(String[] args)
   {
       System.out.println("Maximum water that can be accumulated is " +  
                                        rwt(a.length)); 
   }
}
