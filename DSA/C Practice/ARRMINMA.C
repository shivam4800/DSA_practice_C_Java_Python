#include<stdio.h>
#include<conio.h>

void minmax(int arr[],int arrlen){
int p=0;
int max=arr[p];
int min=arr[p];
while(p<arrlen){
if(arr[p]<min)
{
min=arr[p];
}
else if(arr[p]>max){
max=arr[p];
}
p++;
}
printf("\nMinimum is %d and Maximum is %d",min,max);
}
void main(){
int arr[50];
int i,arrlen;
clrscr();


printf("\nEnter the length of array: ");
scanf("%d",&arrlen);

for(i=0;i<arrlen;i++){
printf("\nEnter the value at index %d: ",i);
scanf("%d:",&arr[i]);
}

for(i=0;i<arrlen;i++){
printf("\nThe value at index %d is %d\n ",i,arr[i]);

}

minmax(arr,arrlen);

getch();
}

