arr=[]
arrLen=int(input("Enter the length of array: "))

for i in range(0,arrLen):
    num=int(input("Enter the value at index "+str(i)+" "))
    arr.append(num)

maxArr=max(arr)
minArr=min(arr)

print("Max is ",maxArr," and min is ",minArr)
