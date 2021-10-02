import random

user = input('가위 바위 보 중에 하나를 입력하시오')

cpu = random.randint(1,3)
A='사용자가 이겼습니다'
B='컴퓨터가 이겼습니다'
C='비겼습니다'

print(cpu)
if (user == '가위'):
    if cpu == 1:
        print(C)
    elif cpu ==2:
        print(B)
    else:
        print(A)
        
elif (user == '바위'):
    if cpu == 1:
        print(A)
    elif cpu ==2:
        print(C)
    else:
        print(B)
        
if (user == '보'):
    if cpu == 1:
        print(B)
    elif cpu ==2:
        print(A)
    else:
        print(C)
            
