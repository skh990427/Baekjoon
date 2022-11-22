import sys
input = sys.stdin.readline

n, m = map(int, input().split())
flag = True

for _ in range(m):
    num = int(input())
    l = list(map(int, input().split()))
    for i in range(num-1):
        if l[i] < l[i+1]:
            flag = False
            break
    if not flag:
        break
if flag:
    print('Yes')
else:
    print('No')