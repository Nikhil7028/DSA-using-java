package Arrays_;

import java.util.Scanner;

//find the maximum value from the array
public class MaxInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter element of array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();            
        }
        
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max < arr[i])
                max=arr[i];
        }
        System.out.print("Maximum value : "+max);
    }
    
}
