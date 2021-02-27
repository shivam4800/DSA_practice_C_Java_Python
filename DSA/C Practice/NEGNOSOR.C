#include<stdio.h>
#include<conio.h>

void main(){
int i,start,temp,arrLen;
int arr[50];
start=0;
clrscr();
printf("\nNegative numbers to one side, without sorting algo!");
printf("\nEnter the size of array: ");
scanf("%d",&arrLen);

for(i=0;i<arrLen;i++)
{
printf("\nEnter the value on index %d: ",i);
scanf("%d",&arr[i]);
}

for(i=0;i<arrLen;i++){
if(arr[i]<0){
temp=arr[i];
arr[i]=arr[start];
arr[start]=temp;
start++;
}
}
for(i=0;i<arrLen;i++)
{
printf("\nThe value at %d is %d",i,arr[i]);
}
getch();
}