package binary.search.in.insersion.sort;
 import java.util.Scanner;

public class BinarySearchInInsersionSort
{

    public static void main(String[] args)
    {
        int [] array = {63,2,5,10,9,12,23,13,4};
        insertionsort(array.length,array);
    }
   
   static int binary(int[] array,int number,int low,int high)
   {
       
       while(low <= high)
       {
           int middle = (high + low)/2;
           if(number > array[middle])
           {
               low = middle+1;
           }
           else if(number < array[middle])
           {
               high=middle-1;
           }
       }
       return low;
      
   }
    
    public static void insertionsort(int size,int [] array)
    {
        int low=0;
        int high = size;
        for(int i=1;i<size;i++)
        {
            int select = array[i];
            int j = i-1; // because we want to compare a[i] with other elemnts by using binarysearch
           int position = binary(array,array[i],low,j);
           
           while(j >= position) // create a while loop for shifting elements
           {
               array[j+1]=array[j];
               j--;
           }
           array[j+1] =select;
            
        }
        
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
