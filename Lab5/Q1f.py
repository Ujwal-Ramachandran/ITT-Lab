def fib(n):
   if n <= 1:
       return n
   else:
       return(fib(n-1) + fib(n-2))

n = int(input("Enter a number : "))
print("Fibonacci series of first",n,"numbers is : ")
for i in range(n):
    print(fib(i),end="   ")