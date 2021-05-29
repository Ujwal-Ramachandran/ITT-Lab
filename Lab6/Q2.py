punctuations = ".?!,;:-({[]})\"\'*"

s = input("Enter a sentence : ")
for i in s :
    if i in punctuations :
        s = s.replace(i,"")

print("Replaced sentense is :",s)
