import random

def defense(user):
    if su==1:
        if user=='왼쪽':
            return False
        else:
            return True
    elif su==2:
        if user=='중앙':
            return False
        else:
            return True
    else:
        if user=='오른쪽':
            return False
        else:
            return True

cnt=0
suc=0
while(cnt<5):
    su=random.randint(1,3)
    user=input('공격 위치 입력(왼쪽, 중앙, 오른쪽): ')
    if defense(user)==False:
        print('공격에 실패했습니다.')
    else:
        print('공격에 성공했습니다.')
        suc+=1
    cnt+=1
print(suc)
