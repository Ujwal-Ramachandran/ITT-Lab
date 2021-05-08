import numpy as np

def printMat(mat,r,c):
    for i in range(r):
	    for j in range(c):
		    print(mat[i][j], end = " ")
	    print()

r = int(input("Enter the number of rows :  "))
c = int(input("Enter the number of columns :  "))
op = 1
print("Enter all elements for Matrix A with a space : ")
e1 = list(map(int, input().split()))
a = np.array(e1).reshape(r,c)
print("Enter all elements for Matrix B with a space : ")
e2 = list(map(int, input().split()))
b = np.array(e2).reshape(r,c)

while op!=0 :
    op = int(input("\n1.Print\n2.Add Matrices\n3.Transpose\n4.Multiply Matrices\n0.Exit\nSelect :  "))
    if op==1 : 
        print('A : ')
        printMat(a,r,c)
        print('\nB : ')
        printMat(b,r,c)
        
    elif op==2 :
        addm = np.add(a,b)
        print('\nA + B = ')
        printMat(addm,r,c)
        
    elif op==3 :
        trA = a.transpose()
        trB = b.transpose()
        print('\nA Transpose : ')
        printMat(trA,r,c)
        print('\nB Transpose : ')
        printMat(trB,r,c)

    elif op==4:
        mulm = np.dot(a,b)
        print('\nA * B = ')
        printMat(mulm,r,c)
        
    elif op==0 :
        print('x---------x----Over----x--------x')
        break
