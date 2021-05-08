ex = 0
while ex!=1:
    no = int(input('Enter a number :  '))
    print('Binary of',no,'is = ',bin(no).replace('0b',''))
    print('Octal of',no,'is = ',oct(no).replace('0o',''))
    print('Hexadecimal of',no,'is = ',hex(no).replace('0x',''))
    print()
    ex = int(input('Press 1 to exit. To try again press anything else :  '))