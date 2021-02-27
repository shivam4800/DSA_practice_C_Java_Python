import java.util.*;

public class ArrMinMax {
    static void minmax(int arr[],int arrLen){
        int p=0;
        int min,max;
        min=arr[p];
        max=arr[p];
        
        while(p<arrLen){
            if(arr[p]<min){
                min=arr[p];
            }
            else if (arr[p]>max){
                max=arr[p];
            }
            p=p+1;
        }

        System.out.println("Max value is "+max+" and Min value is "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int arrLen;
        System.out.println("Enter the length of array: ");
        arrLen=sc.nextInt();

        for(int i=0;i<arrLen;i++){
            System.out.println("Enter the value at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        
        minmax(arr,arrLen);

        
    }
}
