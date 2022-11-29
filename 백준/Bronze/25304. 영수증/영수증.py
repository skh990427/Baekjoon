total = int(input())
n = int(input())

for _ in range(n):
    cost, count = map(int, input().split())
    total -= cost*count

if total == 0:
    print("Yes")
else:
    print("No")