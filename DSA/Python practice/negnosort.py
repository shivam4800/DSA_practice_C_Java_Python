arr =[]
start=0;

arrLen=int(input("Enter the size of array: "))

for i in range(0,arrLen):
    num = int(input("Enter the value at index "+str(i)+" :"))
    arr.append(num)

for i in range(0,arrLen):

    if (arr[i]<0):
        temp=arr[i]
        arr[i]=arr[start]
        arr[start]=temp
        start=start+1

print("Array with negative numbers on one side: ",arr);
