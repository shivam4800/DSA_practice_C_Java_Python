#include<stdio.h>
#include<conio.h>

void sortarr(int arr[],int arrLen){
int i,j,temp;

for(i=0;i<arrLen;++i)
{
for(j=i+1;j<arrLen;++j)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

}

void main()
{
int arr[50];
int arrLen,n,k;
clrscr();
printf("\nKth smallest element program! ");
printf("\nEnter the value of k: ");
scanf("%d",&k);
printf("\nEnter the length of array: ");
scanf("%d",&arrLen);

for(n=0;n<arrLen;n++){
printf("Enter the value at index %d: ",n);
scanf("%d",&arr[n]);
}
sortarr(arr,arrLen);

for(n=0;n<arrLen;n++){
printf("\nThe value at index %d is %d",n,arr[n]);
}
printf("\nThe value of Kth smallest number is %d",arr[k-1]);
getch();
}
