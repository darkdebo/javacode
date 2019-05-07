/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner oj=new Scanner(System.in);
        int n=oj.nextInt();
        int[] player=new int[n];
        int[] villain=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            villain[i]=oj.nextInt();
        }
         for(i=0;i<n;i++)
        {
            player[i]=oj.nextInt();
        }
        for(i=0;i<n;i++){
           //swap the villain array
           while(n>0){
           villain[i]=villain[n-1];
           n--;
           }
        }
        for(i=0;i<n;i++){
            if(player[i]>villain[i]){
                System.out.println("Win");
            }
            else
            {
                 System.out.println("Loose");
            }
        }
        




   }
}
