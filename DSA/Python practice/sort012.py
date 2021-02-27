arr = []

arrLen=int(input("Enter the sixe of Array: "))

for i in range(0,arrLen):
    num=int(input("Enter the number at index "+str(i)+" :"))
    arr.append(num)

arr0 = []
arr1 = []
arr2 =[]

for i in range(0,arrLen):
    num1=arr[i]
    if num1==0:
        arr0.append(num1)
    elif num1==1:
        arr1.append(num1)
    else:
        arr2.append(num1)

final_arr=[]
final_arr=arr0+arr1+arr2
print(final_arr)
        
