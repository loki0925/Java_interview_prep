import java.lang.*;
import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int tc = s.nextInt();
        
        for(int i =0;i<tc;i++){
         int n = s.nextInt();
         int[] arr = new int[n];
         for(int j=0;j<arr.length;j++){
          arr[j]= s.nextInt();
         }
          count1(n,arr);
         
        }
    
    }
    static void count1(int n,int[] arr)
    {
        
      int ans =arr.length;
      int[] stk = new int[ans];
    
        int max=-1;
    
        for(int i=0;i<ans;i++){
            int a = max;
            
            while(a!=-1&&stk[a]>=arr[i]) a--;
            
            if(a==max) max++;
            
            stk[++a]= arr[i];
        }
   
      System.out.println(max+1);
  
        
    }
    
}