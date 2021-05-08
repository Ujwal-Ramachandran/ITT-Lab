def cal(a,b,op):
    if op=='+':
        return a+b
    elif op=='-':
        return a-b
    elif(op=='*'):
        return a*b
    elif(op=='/'):
        return a//b


a,b= input("Enter 2 numbers : ").split()
op = input("Operation : ")
print(a,op,b,' = ',cal(int(a),int(b),op))