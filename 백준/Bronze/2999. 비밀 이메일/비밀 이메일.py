str1 = input()
rlist = []
L = []

for i in range(1, len(str1)):
    if len(str1) % i == 0:
        if i not in rlist:
            rlist.append(int(len(str1) / i))

row = rlist.pop(len(rlist) - 1)
col = int(len(str1) / row)

for i in range(row):
    L.append(str1[i * col:(i + 1) * col])

for i in range(col):
    for j in range(row):
        print(L[j][i], end='')