def recSum(n):
    if(n==0):
        return 0
    else:
        return n + recSum(n-1)
       
n = int(input("Enter a number : "))
print('Sum of first',n,'numbers is =',recSum(n))