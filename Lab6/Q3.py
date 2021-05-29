s = input("Enter a sentence : ").split(" ")
s.sort()
print("The sentence in alphabetical order is : ",end=" ")
for i in s :
    print(i, end=" ")
