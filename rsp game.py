import random

c=0 #cpu가 이기는 횟수
u=0 #사용자가 이기는 횟수

answer='예'
while (answer=='예'):
    n=0
    
    while (n<3):
        cpu=random.randint(1,3)
        user=input("가위/바위/보 중에 입력하세요: ")
        
        if user=='가위':
            if cpu==1:
                print("컴퓨터: 가위 사용자: 가위")
                print("비겼습니다.")
            elif cpu==2:
                print("컴퓨터: 바위 사용자: 가위")
                print("컴퓨터가 이겼습니다.")
                c=c+1
            else:
                print("컴퓨터: 보 사용자: 가위")
                print("사용자가 이겼습니다.")
                u=u+1
                
        elif user=='바위':
            if cpu==1:
                print("컴퓨터: 가위 사용자: 바위")
                print("사용자가 이겼습니다.")
                u=u+1
            elif cpu==2:
                print("컴퓨터: 바위 사용자: 바위")
                print("비겼습니다.")
            else:
                print("컴퓨터: 보 사용자: 바위")
                print("컴퓨터가 이겼습니다.")
                c=c+1
                
        else:
            if cpu==1:
                print("컴퓨터: 가위 사용자: 보")
                print("컴퓨터가 이겼습니다.")
                c=c+1
            elif cpu==2:
                print("컴퓨터: 바위 사용자: 보")
                print("사용자가 이겼습니다.")
                u=u+1
            else:
                print("컴퓨터: 보  사용자: 보")
                print("비겼습니다.")

        n=n+1

    if u>c:
        print("최종 승자는 사용자입니다.")
    elif c>u:
        print("최종 승자는 컴퓨터입니다.")
    else:
        print("무승부")

    answer=input("게임을 다시 할까요?")
