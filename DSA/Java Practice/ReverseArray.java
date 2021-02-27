/**
 * ReverseArray
 */
import java.util.*;


public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[50];
        int arrLen;
        int temp,start,end;
        start=0;
        
        System.out.println("Enter the length of Array: ");
        arrLen = sc.nextInt();
        end=arrLen-1;
        for(int i=0;i<arrLen;i++){
            System.out.println("Enter the value on index "+ i);
            arr[i] = sc.nextInt();
        }

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start=start+1;
            end=end-1;
        }

        System.out.println("Reversed values are: ");
        for(int i=0;i<arrLen;i++){
            System.out.println("Value on index "+i+ " is " + arr[i]+" ");
        }
        
    }
}