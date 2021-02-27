import java.util.*;
import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int k,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        k=sc.nextInt();
        System.out.println("Enter the length of array: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        
        

        for(i=0;i<n;i++)
        {
            System.out.println("Enter the value at position "+i+" : ");
            arr[i]=sc.nextInt();
        }

        

        Arrays.sort(arr);

        for(i=0;i<n;i++)
        {
            System.out.println("Value at position "+i+" is "+arr[i]);
        }

        System.out.println("Kth smallest element is: "+arr[k-1]);


    }
}
