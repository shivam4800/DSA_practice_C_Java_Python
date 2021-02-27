import java.util.*;

public class NegNoSort {
    public static void main(String[] args) {
        int i,arrLen,start,temp;
        start=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        arrLen=sc.nextInt();  
        int[] arr = new int[arrLen];
        for(i=0;i<arrLen;i++){
            System.out.println("Enter tha value at index "+i+" :");
            arr[i]=sc.nextInt();
        }

        for(i=0;i<arrLen;i++){
            if(arr[i]<0){
                temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
            }
        }
        System.out.println("Pushing negatives to one side.....");
        for(i=0;i<arrLen;i++)
        System.out.println("Value at index "+i+" is "+arr[i]);
    }
    
}
