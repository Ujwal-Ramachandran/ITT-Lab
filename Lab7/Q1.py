import sqlite3

# Schema : Student ID, Branch, Semester, Section, CGPA, email
conn = sqlite3.connect('students.db')
conn.execute("CREATE TABLE student (regno INT PRIMARY KEY, name VARCHAR, branch VARCHAR, section VARCHAR, CGPA real, email VARCHAR);")
conn.execute("INSERT INTO student VALUES(1, 'U', 'ICT', 'A', 8.0, 'Uv@mail.com');")
conn.execute("INSERT INTO student VALUES(2, 'A', 'CCE', 'D', 7.3, 'Ab@mail.com');")
conn.execute("INSERT INTO student VALUES(3, 'T', 'ECE', 'B', 8.6, 'Ts@mail.com');")
conn.execute("INSERT INTO student VALUES(4, 'M', 'CSE', 'C', 6.7, 'Mn@mail.com');")
conn.execute("INSERT INTO student VALUES(5, 'I', 'MEC', 'A', 7.9, 'Ij@mail.com');")
conn.execute("INSERT INTO student VALUES(6, 'A', 'Arc', 'F', 9.4, 'Ac@mail.com');")

c = conn.execute("SELECT  * FROM student")
s = []
s_a = []
for i in c :
    s.append(i[1])
    s_a.append(i)

s.sort()
while 1 < 10 :
    op = int(input("Select\n1. Print Names (sorted)\n2. Print all details\n3. Search\n0. Exit\nOption :  "))
    if op == 0 :
        print('x---------x----Over----x--------x')
        break
    
    elif op == 1 :
        print("Names : ",end=" ")
        for i in s :
            print(i,end="   ")
        print("\n")
    
    elif op == 2 :
        print("Reg No\tName\tBranch\tSection\tCGPA\tEmail")
        for i in s_a :
            for j in i :
                print(j,end="\t")
            print("")
        print("")
    elif op == 3 :
        f = 0
        name = input("Enter name of the student : ").upper()
        for i in s_a :
            if name in i :
                f = 1
                print("Reg No\tName\tBranch\tSection\tCGPA\tEmail")
                for j in i :
                    print(j,end="\t")
                print("\n")
        if f == 0 :
            print("No student with name",name,"exists.\n")
    
    else :
        print("Invalid option.\n")

            
