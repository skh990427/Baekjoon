cost, money = map(int, input().split())

if len(str(cost)) == money:
    print(10 ** money)
else:
    print(round(cost, -money))