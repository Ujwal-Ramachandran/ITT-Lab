def pr(mat,r,c):
    for i in range(r):
	    for j in range(c):
		    print(mat[i][j], end = " ")
	    print()

r = int(input("Enter the number of rows:"))
c = int(input("Enter the number of columns:"))
a = []
op = 1
print("Enter elements for matrix A:")
for i in range(r):		 
	for j in range(c):	 
		a[i][j] = int(input())
print("Enter elements for matrix A:")
for i in range(r):		 
	for j in range(c):	 
		a[i][j] = int(input())

while op!=0 :
    op = int(input("Select\n 1.Add Matrices\n2.Transpose\n3.Multiply Matrices\n4.Print\n0.Exit"))