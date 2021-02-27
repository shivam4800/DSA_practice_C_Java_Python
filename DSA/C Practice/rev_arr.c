#include<stdio.h>
#include<conio.h>

void main(){
int arr[100];
int length,i,temp,start,end;
start=0;

printf("Program for reversing an array!");
printf("Enter length of array: ");
scanf("%d",&length);
end=length-1;
for(i=0;i<length;i++)
{
printf("Enter the %d number ",i);
scanf("%d",&arr[i]);
}
while(start<end){

temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}

for(i=0;i<length;i++)
{
printf("%d\n",arr[i]);
}

getch();
}
