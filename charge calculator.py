print("당신은 별다방에 왔습니다.\n")
print("---별다방 메뉴---")
print("[1] 아메리카노: 5500원")
print("[2] 카페라떼: 6000원")
print("[3] 카푸치노: 6500원")
print("[0] 종료\n")
print("음료를 주문하십시요.")

answer='y'
while(answer=='y'):
    name=input("당신의 이름: ")
    menu=1
    price=0
    while(menu!=0):
        menu=int(input("메뉴 선택: "))
        if menu==0:
            break
        count=int(input("수량 선택: "))
        if menu==1:
            price=price+5500*count
        elif menu==2:
            price=price+6000*count
        else:
            price=price+6500*count

    print(name,"님의 총 요금은",str(price),"원 입니다.")
    answer=input("다음 손님이 있습니까(y/n)? ")
