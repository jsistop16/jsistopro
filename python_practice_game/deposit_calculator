deposit=int(input("매월 입금액: "))
year=int(input("연이율: "))
month=int(input("월 단위 기간: "))
account=0
n=0

while(n<month):
    account=(deposit+account)*(((year/100)/12)+1)
    n=n+1
    print(n,"달 후에, 계좌 잔고는",str(int(account+0.5)),"원 입니다.")

print("최종 계좌 잔고는",str(int(account+0.5)),"원 입니다.")
