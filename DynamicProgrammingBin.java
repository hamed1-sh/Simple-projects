
package dynamic.programming.bin;

import java.util.Scanner;


public class DynamicProgrammingBin {

    
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        //Declare power and coefficient
        int n,k;
        System.out.println("Please insert a power :");
        //Get power
        n = input.nextInt();
        System.out.println("Which coefficient :");
        //Get coefficient
        k = input.nextInt();
        long start = System.nanoTime();
        System.out.println(bin(n+1,k));
        long end = System.nanoTime();
        //Computing elapsed time
        System.out.println("It takes about :" + ((end - start))/1000 + "microseconds");
    }
    static int bin(int n,int k)
    {
      //Declare a 2D array
      int[][] Bin = new int[n][n];
      //Initialize Bin[0][0]
      Bin[0][0] =1;
      //Iterating row
      for(int i=1;i<n;i++)
      {
          //Iterating column
          for(int j=0;j<=Math.min(i, k);j++)
          {
              if(j == 0 || i == j)
              {
                  //First and last coefficient is 1
                  Bin[i][j] =1;
              }
              else
              {
              //Use upper row to compute current coefficient
              Bin[i][j] = Bin[i-1][j-1] + Bin[i-1][j];
              }
          }
      }
      return Bin[n-1][k-1];
    }
    
}
