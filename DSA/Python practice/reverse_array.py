arr=[];

arrLen = int(input("Enter length of the array: "))

for i in range(0,arrLen):
    num=int(input("Enter value of index "+str(i)+" :"))
    arr.append(num)


print(arr[::-1]) #step -1 he, so rev
    
