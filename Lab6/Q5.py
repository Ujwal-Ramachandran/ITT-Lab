import re

s = input("Enter a sentense : ")
r = input("Enter a word : ")
print("Which word should",r,"replace : ", end="")
p = input()
print (re.sub(p, r, s))