#include<stdio.h>
#include<conio.h>

void main(){
int arr[50];
int i,j,k,c0,c1,c2,n,arrLen;
c0=0;
c1=0;
c2=0;
clrscr();

printf("\nEnter the length of array: ");
scanf("%d",&arrLen);

for(n=0;n<arrLen;n++)
{
printf("\nEnter the value at index %d: ",n);
scanf("%d",&arr[n]);
}

printf("\nBefore sorting: ");

for(n=0;n<arrLen;n++)
{
printf("\nThe value at index %d is %d",n,arr[n]);
if(arr[n]==0){
++c0;
}
else if(arr[n]==1){
++c1;
}
else{
++c2;
}
}
printf("\n %d,%d,%d \n",c0,c1,c2);
for(i=0;i<c0;i++)
{
arr[i]=0;
}
for(j=c0;j<(n-c0);j++)
{
arr[j]=1;
}
for(k=(n-c2);k<n;k++)
 {
arr[k]=2;
}
/*arr[i]=0;
arr[j]=1;
arr[k]=2;
}
}
}*/
printf("\nAfter sorting: \n");
for(n=0;n<arrLen;n++)
{
printf("\nThe value at index %d is %d",n,arr[n]);
}
getch();
}

