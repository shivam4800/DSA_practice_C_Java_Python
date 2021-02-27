arr=[]

arrLen = int(input("\nEnter the length of array: "))
k=int(input("\nenter the value of k: "))

for i in range(0,arrLen):
    num = int(input("\nEnter the value at position "+str(i)+" : "))
    arr.append(num)
arr.sort()
print("Sorted array is: ",arr)
print("Kth smallest number is: ",arr[k-1])


