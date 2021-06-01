import sqlite3

conn = sqlite3.connect('student.db')
conn.execute("CREATE TABLE student (regno INT PRIMARY KEY, name VARCHAR, dept VARCHAR);")
conn.execute("INSERT INTO student VALUES(1, 'Abc', 'IT');")
conn.execute("INSERT INTO student VALUES(2, 'Def', 'CCE');")
conn.execute("INSERT INTO student VALUES(3, 'Ijk', 'ECE');")
conn.execute("INSERT INTO student VALUES(4, 'Iua', 'CSE');")
conn.execute("INSERT INTO student VALUES(5, 'Crp', 'MECH');")

s_names = []
s_regno = []
s_depts = []
c = conn.execute("SELECT * FROM student")

for i in c:
	s_regno.append(i[0])
	s_names.append(i[1])
	s_depts.append(i[2])

reg = int(input("Enter registration number of the student : "))

if reg in s_regno :
	r = conn.execute("SELECT * FROM student WHERE regno LIKE '"+str(reg)+"';")
	for i in r :
		print("Registration number :",i[0],"\tName :",i[1],"\tDept :",i[2])
else :
	print("No student with registration number as",reg,"exists")

conn.commit()
conn.close()