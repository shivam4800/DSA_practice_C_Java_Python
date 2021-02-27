import java.util.*;

public class Sort012 {

    public static void main(String[] args) {
        int i,j,k,c0,c1,c2,arrLen,n;
        c0=c1=c2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        arrLen=sc.nextInt();
        int[] arr = new int[arrLen];

        for(n=0;n<arrLen;n++){
            System.out.println("Enter the value at index "+n+" : ");
            arr[n]=sc.nextInt();
        }

        System.out.println("Before sorting.....");
        for(n=0;n<arrLen;n++){
            System.out.println("The value at index "+n+" is "+arr[n]);
            if(arr[n]==0){
                c0=c0+1;
            }
            else if(arr[n]==1){
                c1=c1+1;
            }
            else{
                c2=c2+1;
            }
        }

        for(i=0;i<c0;i++){
            arr[i]=0;
        }
            for(j=c0;j<(arrLen-c0);j++){
                arr[j]=1;
            }
                for(k=(n-c2);k<n;k++){
                    
                   
                    arr[k]=2;
                }
           

        System.out.println("After sorting.....");
        for(n=0;n<arrLen;n++){
            System.out.println("The value at index "+n+" is "+arr[n]);
        }

    }
    
}
