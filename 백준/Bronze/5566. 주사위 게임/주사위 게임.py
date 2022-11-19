n, m = map(int, input().split(" "))

nlist = []
mlist = []

for i in range(n):
    nlist.append(int(input()))

for i in range(m):
    mlist.append(int(input()))

ping = 1
cnt = 0
for i in mlist:
    cnt += 1
    ping += i
    if ping >= n:
        break
    ping += nlist[ping-1]
    if ping >= n:
        break

print(cnt)