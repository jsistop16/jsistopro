import time
import random

def Opening():
    print('''-----------------인생 역전 게임-----------------
당신은 MBS의 유명한 서바이벌 게임인 "해냈어!"참가하였습니다.
드디어 마지막 라운드에 도전입니다
당신 앞에는 천사카드와 악마카드가 뒤집어져 있습니다.
천사카드를 고르면 상금 1,000,000,000을 타게 될 것이고
악마카드를 고르면 모든 것을 잃고 빈 손으로 돌아가게 됩니다.''')
    print()

    return

def drawAngel():
    print('''
||-----------|
|| (\ -=- /) |
|| (\ ( ) /) |
|| ( /   \ ) |
||    > <    |
||  /    \\  |
||  `- _ -   |
||-----------|
     AngelCard
''')
    return
def drawDevil():
    print('''
||-----------|
||           |
|| (\_____/) |
|| (==` .`) *|
|| ( /  )/   |
|| (__(")(") |
||-----------|
   DevilCard
   ''')
    print('저런......')
    print('당신은 모든 것을 잃고 집으로... 공수래공수거')
    return

def drawPrize():
    print('축하합니다! 당신은 상금 1,000,000,000을 받게 되었습니다.')
    print('''
        . ☆ .
        |\/|\/|
        {-----}
    __-----_-----__
  /1,000,000,000,000\\
  --------_\|/_-------
      ''')
    return

def getCardNum():
    while True:
        num=input('어떤 카드를 고르시겠습니까? (1) or (2) : ')
        if num == '1' or num=='2':
            break
    return num

def compareCard(cardNum):
    if cardNum==str(realcard):
        drawAngel()
        drawPrize()
        return 'No'
    
    else:
        drawDevil()
        print('')
        Goback = input('선택의 순간으로 되돌아가겠습니까? Yes or No : ')
        return Goback
    

while True:
    Opening()
    realcard=random.randint(1,2)
    cardNum=getCardNum()
    print('당신이 고른 카드는...')
    time.sleep(2)
    answer=compareCard(cardNum)
    if answer=='No':
        break
    



